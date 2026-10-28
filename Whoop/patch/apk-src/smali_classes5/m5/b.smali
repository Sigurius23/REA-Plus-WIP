.class public abstract Lm5/b;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field public final a:Landroid/os/Bundle;

.field public final b:Landroid/os/Bundle;

.field public final c:Ldb/j0;


# direct methods
.method public constructor <init>(Landroid/os/Bundle;Landroid/os/Bundle;Ldb/j0;)V
    .locals 2

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lm5/b;->a:Landroid/os/Bundle;

    iput-object p2, p0, Lm5/b;->b:Landroid/os/Bundle;

    iput-object p3, p0, Lm5/b;->c:Ldb/j0;

    const-string p3, "androidx.credentials.BUNDLE_KEY_IS_AUTO_SELECT_ALLOWED"

    const/4 v0, 0x0

    invoke-virtual {p1, p3, v0}, Landroid/os/BaseBundle;->putBoolean(Ljava/lang/String;Z)V

    const-string v1, "androidx.credentials.BUNDLE_KEY_PREFER_IMMEDIATELY_AVAILABLE_CREDENTIALS"

    invoke-virtual {p1, v1, v0}, Landroid/os/BaseBundle;->putBoolean(Ljava/lang/String;Z)V

    invoke-virtual {p2, p3, v0}, Landroid/os/BaseBundle;->putBoolean(Ljava/lang/String;Z)V

    return-void
.end method
