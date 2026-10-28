.class public final Lzt/p;
.super Lvo/a;
.source "SourceFile"


# static fields
.field public static final CREATOR:Landroid/os/Parcelable$Creator;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Landroid/os/Parcelable$Creator<",
            "Lzt/p;",
            ">;"
        }
    .end annotation
.end field


# instance fields
.field public final w:Landroid/os/Bundle;

.field public x:La0/g;

.field public y:Ldb/j0;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, Lz10/k;

    const/4 v1, 0x5

    invoke-direct {v0, v1}, Lz10/k;-><init>(I)V

    sput-object v0, Lzt/p;->CREATOR:Landroid/os/Parcelable$Creator;

    return-void
.end method

.method public constructor <init>(Landroid/os/Bundle;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lzt/p;->w:Landroid/os/Bundle;

    return-void
.end method


# virtual methods
.method public final b()Ljava/lang/String;
    .locals 2

    iget-object v0, p0, Lzt/p;->w:Landroid/os/Bundle;

    const-string v1, "collapse_key"

    invoke-virtual {v0, v1}, Landroid/os/BaseBundle;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public final f()Ljava/util/Map;
    .locals 6

    iget-object v0, p0, Lzt/p;->x:La0/g;

    if-nez v0, :cond_2

    new-instance v0, La0/g;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, La0/f1;-><init>(I)V

    iget-object v1, p0, Lzt/p;->w:Landroid/os/Bundle;

    invoke-virtual {v1}, Landroid/os/BaseBundle;->keySet()Ljava/util/Set;

    move-result-object v2

    invoke-interface {v2}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object v2

    :cond_0
    :goto_0
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    move-result v3

    if-eqz v3, :cond_1

    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ljava/lang/String;

    invoke-virtual {v1, v3}, Landroid/os/BaseBundle;->get(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v4

    instance-of v5, v4, Ljava/lang/String;

    if-eqz v5, :cond_0

    check-cast v4, Ljava/lang/String;

    const-string v5, "google."

    invoke-virtual {v3, v5}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    move-result v5

    if-nez v5, :cond_0

    const-string v5, "gcm."

    invoke-virtual {v3, v5}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    move-result v5

    if-nez v5, :cond_0

    const-string v5, "from"

    invoke-virtual {v3, v5}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v5

    if-nez v5, :cond_0

    const-string v5, "message_type"

    invoke-virtual {v3, v5}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v5

    if-nez v5, :cond_0

    const-string v5, "collapse_key"

    invoke-virtual {v3, v5}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v5

    if-nez v5, :cond_0

    invoke-virtual {v0, v3, v4}, La0/f1;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    goto :goto_0

    :cond_1
    iput-object v0, p0, Lzt/p;->x:La0/g;

    :cond_2
    iget-object v0, p0, Lzt/p;->x:La0/g;

    return-object v0
.end method

.method public final h()Ldb/j0;
    .locals 3

    iget-object v0, p0, Lzt/p;->y:Ldb/j0;

    if-nez v0, :cond_0

    iget-object v0, p0, Lzt/p;->w:Landroid/os/Bundle;

    invoke-static {v0}, Lzd3/x;->n(Landroid/os/Bundle;)Z

    move-result v1

    if-eqz v1, :cond_0

    new-instance v1, Ldb/j0;

    new-instance v2, Lzd3/x;

    invoke-direct {v2, v0}, Lzd3/x;-><init>(Landroid/os/Bundle;)V

    invoke-direct {v1, v2}, Ldb/j0;-><init>(Lzd3/x;)V

    iput-object v1, p0, Lzt/p;->y:Ldb/j0;

    :cond_0
    iget-object v0, p0, Lzt/p;->y:Ldb/j0;

    return-object v0
.end method

.method public final writeToParcel(Landroid/os/Parcel;I)V
    .locals 2

    const/16 p2, 0x4f45

    invoke-static {p1, p2}, Lvo/c;->s(Landroid/os/Parcel;I)I

    move-result p2

    const/4 v0, 0x2

    iget-object v1, p0, Lzt/p;->w:Landroid/os/Bundle;

    invoke-static {p1, v0, v1}, Lvo/c;->e(Landroid/os/Parcel;ILandroid/os/Bundle;)V

    invoke-static {p1, p2}, Lvo/c;->t(Landroid/os/Parcel;I)V

    return-void
.end method
