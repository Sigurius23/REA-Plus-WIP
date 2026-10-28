package p694zv;

import android.os.Handler;
import android.os.Looper;
import aw.C2100a;
import com.mapbox.maps.MapController;
import java.util.concurrent.CopyOnWriteArraySet;
import p127ev.C13668i;
import p127ev.InterfaceC13669j;
import p157fv.C14802h;
import p157fv.InterfaceC14795a;
import p715kotlin.jvm.internal.AbstractC22676k;

/* JADX INFO: renamed from: zv.b */
/* JADX INFO: loaded from: classes6.dex */
public final class C41161b implements InterfaceC13669j {

    /* JADX INFO: renamed from: y */
    public InterfaceC14795a f177574y;

    /* JADX INFO: renamed from: w */
    public final Handler f177572w = new Handler(Looper.getMainLooper());

    /* JADX INFO: renamed from: x */
    public final CopyOnWriteArraySet f177573x = new CopyOnWriteArraySet();

    /* JADX INFO: renamed from: z */
    public final C41160a f177575z = new C41160a(this);

    /* JADX INFO: renamed from: E */
    public C41162c f177570E = C41162c.f177576a;

    /* JADX INFO: renamed from: F */
    public final C2100a f177571F = new C2100a();

    @Override // p127ev.InterfaceC13669j
    /* JADX INFO: renamed from: a */
    public final void mo38544a() {
        InterfaceC14795a interfaceC14795a = this.f177574y;
        if (interfaceC14795a == null) {
            AbstractC22676k.m65757q("cameraPlugin");
            throw null;
        }
        C41160a listener = this.f177575z;
        AbstractC22676k.m65750j(listener, "listener");
        ((C14802h) interfaceC14795a).f54937J.remove(listener);
    }

    @Override // p127ev.InterfaceC13669j
    /* JADX INFO: renamed from: f */
    public final void mo38545f(C13668i c13668i) {
        MapController mapController = (MapController) c13668i.f48462i;
        AbstractC22676k.m65750j(mapController, "<this>");
        InterfaceC13669j plugin = mapController.getPlugin("MAPBOX_CAMERA_PLUGIN_ID");
        AbstractC22676k.m65747g(plugin);
        InterfaceC14795a interfaceC14795a = (InterfaceC14795a) plugin;
        this.f177574y = interfaceC14795a;
        C41160a listener = this.f177575z;
        AbstractC22676k.m65750j(listener, "listener");
        ((C14802h) interfaceC14795a).f54937J.add(listener);
        AbstractC22676k.m65750j(mapController, "<this>");
        InterfaceC13669j plugin2 = mapController.getPlugin("MAPBOX_CAMERA_PLUGIN_ID");
        AbstractC22676k.m65747g(plugin2);
        AbstractC22676k.m65750j(mapController, "<this>");
        InterfaceC13669j plugin3 = mapController.getPlugin("MAPBOX_CAMERA_PLUGIN_ID");
        AbstractC22676k.m65747g(plugin3);
    }

    @Override // p127ev.InterfaceC13669j
    public final void initialize() {
    }
}
