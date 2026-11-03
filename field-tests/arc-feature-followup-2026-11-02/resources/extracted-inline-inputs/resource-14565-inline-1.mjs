
// Until themes can clear the cache, force-reload the theme stylesheet.
document.querySelector('#incognitothemecss').href =
    'chrome://theme/css/incognito_tab_theme.css?' + Date.now();
