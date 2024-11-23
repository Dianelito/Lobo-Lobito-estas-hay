![alt text](<Lobo Lobito-1.png>)

Español:
"Lobo Lobito Estas Hay" es un plugin de Minecraft avanzado que combina modelos 3D, sonidos personalizados y animaciones únicas, compatible con Oraxen. Diseñado para mejorar la experiencia de los jugadores, permite configurar fácilmente los elementos visuales y auditivos para crear lobos personalizados que enriquecen la jugabilidad.

Inglés:
"Lobo Lobito Estas Hay" is an advanced Minecraft plugin featuring 3D models, custom sounds, and unique animations, fully compatible with Oraxen. Designed to enhance player experiences, it allows easy customization of visual and auditory elements to create personalized wolves that enrich gameplay.



config.yml:
[code=YAML]models:
  wolf:
    model: "oraxen_model_wolf"
    animation: "oraxen_animation_wolf"
    sound: "oraxen_sound_wolf"
  cub:
    model: "oraxen_model_cub"
    animation: "oraxen_animation_cub"
    sound: "oraxen_sound_cub"[/code]

messages.yml:
[code=YAML]oraxen_not_found: "&cOraxen no encontrado. Deshabilitando el plugin."
plugin_enabled: "&aLobo Lobito Estas Hay activado."
plugin_disabled: "&cLobo Lobito Estas Hay desactivado."
only_players: "&cEste comando solo puede ser usado por jugadores."
command_usage: "&eUsa /lobito [spawn/config/reload]."
wolf_spawned: "&aLobo personalizado generado exitosamente."
current_config: "&eModelo actual: {model}"
config_reloaded: "&aConfiguración recargada."
invalid_command: "&cComando no válido. Usa /lobito [spawn/config/reload]."
[/code]


Dependencies / Dependencias:

https://www.spigotmc.org/resources/%E2%9C%85-10-%E2%98%84%EF%B8%8F-oraxen-%C2%BB-custom-blocks-items-and-inventories.72448/