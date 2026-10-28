.class public final Ltk0/b;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ltk0/d;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Ltk0/b$a;
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0010\"\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0005\u0008\u0000\u0018\u0000 \u00152\u00020\u0001:\u0001\u000cB\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u00a2\u0006\u0004\u0008\u0004\u0010\u0005J)\u0010\u000c\u001a\u000e\u0012\n\u0012\u0008\u0012\u0004\u0012\u00020\u000b0\n0\t2\u000c\u0010\u0008\u001a\u0008\u0012\u0004\u0012\u00020\u00070\u0006H\u0017\u00a2\u0006\u0004\u0008\u000c\u0010\rJ\u0013\u0010\u000f\u001a\u00020\u000b*\u00020\u000eH\u0000\u00a2\u0006\u0004\u0008\u000f\u0010\u0010J\u000f\u0010\u0012\u001a\u00020\u0011H\u0000\u00a2\u0006\u0004\u0008\u0012\u0010\u0013R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u000c\u0010\u0014\u00a8\u0006\u0016"
    }
    d2 = {
        "Ltk0/b;",
        "Ltk0/d;",
        "Ltr2/n;",
        "logger",
        "<init>",
        "(Ltr2/n;)V",
        "",
        "Ljava/util/UUID;",
        "serviceIds",
        "Lec3/l;",
        "",
        "Ltk0/f;",
        "a",
        "(Ljava/util/Set;)Lec3/l;",
        "Ltd3/m;",
        "d",
        "(Ltd3/m;)Ltk0/f;",
        "Ltd3/n;",
        "c",
        "()Ltd3/n;",
        "Ltr2/n;",
        "b",
        "whoop-ble-transport_release"
    }
    k = 0x1
    mv = {
        0x2,
        0x3,
        0x0
    }
    xi = 0x30
.end annotation


# static fields
.field private static final b:Ltk0/b$a;


# instance fields
.field private final a:Ltr2/n;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, Ltk0/b$a;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Ltk0/b$a;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    sput-object v0, Ltk0/b;->b:Ltk0/b$a;

    return-void
.end method

.method public constructor <init>(Ltr2/n;)V
    .locals 1

    const-string v0, "logger"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Ltk0/b;->a:Ltr2/n;

    return-void
.end method

.method public static final synthetic b(Ltk0/b;)Ltr2/n;
    .locals 0

    iget-object p0, p0, Ltk0/b;->a:Ltr2/n;

    return-object p0
.end method


# virtual methods
.method public a(Ljava/util/Set;)Lec3/l;
    .locals 2
    .annotation build Landroid/annotation/SuppressLint;
        value = {
            "MissingPermission"
        }
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/Set<",
            "Ljava/util/UUID;",
            ">;)",
            "Lec3/l;"
        }
    .end annotation

    const-string v0, "serviceIds"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, Ltk0/b$b;

    const/4 v1, 0x0

    invoke-direct {v0, p1, p0, v1}, Ltk0/b$b;-><init>(Ljava/util/Set;Ltk0/b;Lq83/d;)V

    invoke-static {v0}, Lec3/v;->j(Lc93/m;)Lec3/c;

    move-result-object p1

    return-object p1
.end method

.method public final c()Ltd3/n;
    .locals 20

    new-instance v0, Ltd3/n;

    const/4 v1, 0x2

    const/4 v2, 0x1

    const-wide/16 v3, 0x0

    const/4 v6, 0x3

    const/4 v7, 0x0

    const/16 v8, 0xff

    const-wide/16 v12, 0x2710

    const-wide/16 v16, 0x0

    move v5, v2

    move v9, v2

    move v10, v2

    move v11, v2

    move-wide v14, v12

    move-wide/from16 v18, v16

    invoke-direct/range {v0 .. v19}, Ltd3/n;-><init>(IIJIIZIZZZJJJJ)V

    return-object v0
.end method

.method public final d(Ltd3/m;)Ltk0/f;
    .locals 5

    const-string v0, "<this>"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p1, Ltd3/m;->w:Landroid/bluetooth/BluetoothDevice;

    invoke-virtual {v0}, Landroid/bluetooth/BluetoothDevice;->getAddress()Ljava/lang/String;

    move-result-object v0

    const-string v1, "getAddress(...)"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v1, p1, Ltd3/m;->x:Ltd3/l;

    const/4 v2, 0x0

    if-eqz v1, :cond_0

    iget-object v3, v1, Ltd3/l;->f:Ljava/lang/String;

    goto :goto_0

    :cond_0
    move-object v3, v2

    :goto_0
    iget p1, p1, Ltd3/m;->y:I

    if-eqz v1, :cond_1

    iget-object v1, v1, Ltd3/l;->b:Ljava/util/List;

    if-eqz v1, :cond_1

    check-cast v1, Ljava/lang/Iterable;

    new-instance v2, Ljava/util/ArrayList;

    const/16 v4, 0xa

    invoke-static {v1, v4}, Lm83/u;->i0(Ljava/lang/Iterable;I)I

    move-result v4

    invoke-direct {v2, v4}, Ljava/util/ArrayList;-><init>(I)V

    invoke-interface {v1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :goto_1
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v4

    if-eqz v4, :cond_1

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Landroid/os/ParcelUuid;

    invoke-virtual {v4}, Landroid/os/ParcelUuid;->getUuid()Ljava/util/UUID;

    move-result-object v4

    invoke-interface {v2, v4}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    goto :goto_1

    :cond_1
    if-nez v2, :cond_2

    sget-object v2, Lm83/y;->w:Lm83/y;

    :cond_2
    new-instance v1, Ltk0/f;

    invoke-direct {v1, v0, v3, p1, v2}, Ltk0/f;-><init>(Ljava/lang/String;Ljava/lang/String;ILjava/util/List;)V

    return-object v1
.end method
