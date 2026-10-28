package p667z0;

import android.R;
import android.app.PendingIntent;
import android.app.RemoteAction;
import android.content.Context;
import android.os.Build;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.textclassifier.TextClassification;
import io.getstream.chat.android.p226ui.feature.messages.composer.attachment.picker.poll.MenuItemOnMenuItemClickListenerC19699b;
import java.util.Collection;
import p027b3.AbstractC2378g1;
import p601x0.AbstractC37791b;
import p601x0.C37792c;
import p601x0.C37793d;
import p601x0.C37795f;
import p601x0.C37797h;
import p715kotlin.jvm.internal.AbstractC22676k;

/* JADX INFO: renamed from: z0.d */
/* JADX INFO: loaded from: classes5.dex */
public final class C39922d {

    /* JADX INFO: renamed from: a */
    public final C39923e f172345a;

    /* JADX INFO: renamed from: b */
    public final C39920b f172346b;

    /* JADX INFO: renamed from: c */
    public final C39920b f172347c;

    /* JADX INFO: renamed from: d */
    public final View f172348d;

    public C39922d(C39923e c39923e, C39920b c39920b, C39920b c39920b2, View view) {
        this.f172345a = c39923e;
        this.f172346b = c39920b;
        this.f172347c = c39920b2;
        this.f172348d = view;
    }

    /* JADX WARN: Type inference failed for: r2v3, types: [java.lang.Object, java.util.List] */
    /* JADX INFO: renamed from: a */
    public final boolean m128084a(Menu menu) {
        int i13;
        C37792c c37792c = (C37792c) this.f172346b.invoke();
        int i14 = 0;
        if (AbstractC22676k.m65745e(c37792c, null)) {
            return false;
        }
        menu.clear();
        ?? r10 = c37792c.f161892a;
        int size = ((Collection) r10).size();
        int i15 = 0;
        int i16 = 1;
        int i17 = 1;
        while (i15 < size) {
            AbstractC37791b abstractC37791b = (AbstractC37791b) r10.get(i15);
            if (abstractC37791b instanceof C37793d) {
                i13 = i16 + 1;
                final C37793d c37793d = (C37793d) abstractC37791b;
                MenuItem menuItemAdd = menu.add(i17, i16, i16, c37793d.f161893b);
                menuItemAdd.setShowAsAction(2);
                final int i18 = 0;
                menuItemAdd.setOnMenuItemClickListener(new MenuItem.OnMenuItemClickListener() { // from class: z0.c
                    @Override // android.view.MenuItem.OnMenuItemClickListener
                    public final boolean onMenuItemClick(MenuItem menuItem) throws PendingIntent.CanceledException {
                        switch (i18) {
                            case 0:
                                ((C37793d) c37793d).f161895d.invoke(((C39922d) this).f172345a);
                                break;
                            default:
                                Context context = (Context) c37793d;
                                TextClassification textClassification = (TextClassification) this;
                                String text = textClassification.getText();
                                PendingIntent activity = PendingIntent.getActivity(context, text != null ? text.hashCode() : 0, textClassification.getIntent(), 201326592);
                                if (Build.VERSION.SDK_INT < 34) {
                                    activity.send();
                                } else {
                                    AbstractC2378g1.m7342q(activity);
                                }
                                break;
                        }
                        return true;
                    }
                });
            } else {
                if (abstractC37791b instanceof C37797h) {
                    i13 = i16 + 1;
                    final Context context = this.f172348d.getContext();
                    C37797h c37797h = (C37797h) abstractC37791b;
                    final TextClassification textClassification = c37797h.f161902b;
                    int i19 = c37797h.f161903c;
                    if (i19 < 0) {
                        MenuItem menuItemAdd2 = menu.add(R.id.textAssist, R.id.textAssist, i16, textClassification.getLabel());
                        menuItemAdd2.setShowAsAction(2);
                        menuItemAdd2.setIcon(textClassification.getIcon());
                        final int i24 = 1;
                        menuItemAdd2.setOnMenuItemClickListener(new MenuItem.OnMenuItemClickListener() { // from class: z0.c
                            @Override // android.view.MenuItem.OnMenuItemClickListener
                            public final boolean onMenuItemClick(MenuItem menuItem) throws PendingIntent.CanceledException {
                                switch (i24) {
                                    case 0:
                                        ((C37793d) context).f161895d.invoke(((C39922d) textClassification).f172345a);
                                        break;
                                    default:
                                        Context context2 = (Context) context;
                                        TextClassification textClassification2 = (TextClassification) textClassification;
                                        String text = textClassification2.getText();
                                        PendingIntent activity = PendingIntent.getActivity(context2, text != null ? text.hashCode() : 0, textClassification2.getIntent(), 201326592);
                                        if (Build.VERSION.SDK_INT < 34) {
                                            activity.send();
                                        } else {
                                            AbstractC2378g1.m7342q(activity);
                                        }
                                        break;
                                }
                                return true;
                            }
                        });
                    } else {
                        int i25 = i19 == 0 ? 1 : i14;
                        RemoteAction remoteAction = textClassification.getActions().get(i19);
                        MenuItem menuItemAdd3 = menu.add(R.id.textAssist, i25 != 0 ? 16908353 : i14, i16, remoteAction.getTitle());
                        menuItemAdd3.setShowAsAction(i25 == 0 ? 0 : 2);
                        if (i25 != 0 || remoteAction.shouldShowIcon()) {
                            menuItemAdd3.setIcon(remoteAction.getIcon().loadDrawable(context));
                        }
                        menuItemAdd3.setOnMenuItemClickListener(new MenuItemOnMenuItemClickListenerC19699b(remoteAction, 1));
                    }
                } else if (abstractC37791b instanceof C37795f) {
                    i17++;
                }
                i15++;
                i14 = 0;
            }
            i16 = i13;
            i15++;
            i14 = 0;
        }
        return true;
    }
}
