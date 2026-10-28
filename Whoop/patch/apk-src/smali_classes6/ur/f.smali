.class public final Lur/f;
.super Lip/h;
.source "SourceFile"


# instance fields
.field public final g:Ldb/j0;

.field public final h:Lcq/i;

.field public final synthetic i:Lur/g;


# direct methods
.method public constructor <init>(Lur/g;Lcq/i;)V
    .locals 3

    new-instance v0, Ldb/j0;

    const-string v1, "OnRequestInstallCallback"

    const/16 v2, 0xd

    invoke-direct {v0, v1, v2}, Ldb/j0;-><init>(Ljava/lang/String;I)V

    iput-object p1, p0, Lur/f;->i:Lur/g;

    const/4 p1, 0x4

    invoke-direct {p0, p1}, Lip/h;-><init>(I)V

    const-string p1, "com.google.android.play.core.inappreview.protocol.IInAppReviewServiceCallback"

    invoke-virtual {p0, p0, p1}, Landroid/os/Binder;->attachInterface(Landroid/os/IInterface;Ljava/lang/String;)V

    iput-object v0, p0, Lur/f;->g:Ldb/j0;

    iput-object p2, p0, Lur/f;->h:Lcq/i;

    return-void
.end method
