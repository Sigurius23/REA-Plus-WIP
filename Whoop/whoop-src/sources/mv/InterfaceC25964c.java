package mv;

import com.mapbox.common.Cancelable;
import com.mapbox.maps.MapInteraction;
import com.mapbox.maps.PlatformEventInfo;

/* JADX INFO: renamed from: mv.c */
/* JADX INFO: loaded from: classes6.dex */
public interface InterfaceC25964c {
    Cancelable addInteraction(MapInteraction mapInteraction);

    void dispatch(PlatformEventInfo platformEventInfo);
}
