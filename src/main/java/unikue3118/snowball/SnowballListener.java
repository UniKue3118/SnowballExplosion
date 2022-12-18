package unikue3118.snowball;

import org.bukkit.entity.Player;
import org.bukkit.entity.Snowball;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.entity.ProjectileHitEvent;
import org.bukkit.projectiles.ProjectileSource;

public class SnowballListener implements Listener {
    @EventHandler
    public void onProjectileHit(ProjectileHitEvent snow) { //투사체 착탄시 실행
        if (SnowballCommand.SnowballExplode == true) {
            if (snow.getEntity().getShooter() instanceof Player) {  //만약 플레이어가 눈덩이를 쏘면
                ProjectileSource shooter = snow.getEntity().getShooter();
                Snowball snowball = (Snowball) snow.getEntity(); //객체를 눈덩이로 변환
                snowball.getWorld().createExplosion(snowball.getLocation(), 1.5F, false, false, (Player) shooter);   //폭발 생성
            }
        }
    }
}
