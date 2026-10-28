.class public final Llm0/a;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\t\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0007\u0018\u00002\u00020\u0001B1\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\u0008\u0012\u0008\u0008\u0002\u0010\u000b\u001a\u00020\n\u00a2\u0006\u0004\u0008\u000c\u0010\rR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u000e\u0010\u000fR\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u0010\u0010\u0011R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u0012\u0010\u0013R\u001a\u0010\u0018\u001a\u0008\u0012\u0004\u0012\u00020\u00150\u00148\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u0016\u0010\u0017R\u001d\u0010\u001b\u001a\u0008\u0012\u0004\u0012\u00020\u00150\u00148\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0019\u0010\u0017\u001a\u0004\u0008\u0016\u0010\u001a\u00a8\u0006\u001c"
    }
    d2 = {
        "Llm0/a;",
        "",
        "Landroid/content/Context;",
        "context",
        "Landroid/content/IntentFilter;",
        "intentFilter",
        "Landroid/bluetooth/BluetoothAdapter;",
        "bluetoothAdapter",
        "Lbc3/c0;",
        "applicationScope",
        "Llm0/e;",
        "contextCompatWrapper",
        "<init>",
        "(Landroid/content/Context;Landroid/content/IntentFilter;Landroid/bluetooth/BluetoothAdapter;Lbc3/c0;Llm0/e;)V",
        "a",
        "Landroid/content/Context;",
        "b",
        "Landroid/content/IntentFilter;",
        "c",
        "Landroid/bluetooth/BluetoothAdapter;",
        "Lec3/l;",
        "Llm0/c;",
        "d",
        "Lec3/l;",
        "flow",
        "e",
        "()Lec3/l;",
        "bluetoothStateFlow",
        "connectivity_release"
    }
    k = 0x1
    mv = {
        0x2,
        0x3,
        0x0
    }
    xi = 0x30
.end annotation


# instance fields
.field private final a:Landroid/content/Context;

.field private final b:Landroid/content/IntentFilter;

.field private final c:Landroid/bluetooth/BluetoothAdapter;

.field private final d:Lec3/l;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lec3/l;"
        }
    .end annotation
.end field

.field private final e:Lec3/l;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lec3/l;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>(Landroid/content/Context;Landroid/content/IntentFilter;Landroid/bluetooth/BluetoothAdapter;Lbc3/c0;Llm0/e;)V
    .locals 1

    const-string v0, "context"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "intentFilter"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "bluetoothAdapter"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "applicationScope"

    invoke-static {p4, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "contextCompatWrapper"

    invoke-static {p5, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    iput-object p1, p0, Llm0/a;->a:Landroid/content/Context;

    .line 3
    iput-object p2, p0, Llm0/a;->b:Landroid/content/IntentFilter;

    .line 4
    iput-object p3, p0, Llm0/a;->c:Landroid/bluetooth/BluetoothAdapter;

    .line 5
    new-instance p1, Llm0/a$b;

    const/4 p2, 0x0

    invoke-direct {p1, p5, p0, p2}, Llm0/a$b;-><init>(Llm0/e;Llm0/a;Lq83/d;)V

    invoke-static {p1}, Lec3/v;->j(Lc93/m;)Lec3/c;

    move-result-object p1

    iput-object p1, p0, Llm0/a;->d:Lec3/l;

    .line 6
    new-instance p3, Llm0/a$a;

    invoke-direct {p3, p2}, Llm0/a$a;-><init>(Lq83/d;)V

    .line 7
    new-instance p2, Lec3/a0;

    invoke-direct {p2, p3, p1}, Lec3/a0;-><init>(Lc93/m;Lec3/l;)V

    .line 8
    sget-object p1, Lec3/z1;->a:Lec3/b2;

    const/4 p3, 0x1

    invoke-static {p2, p4, p1, p3}, Lec3/v;->L(Lec3/l;Lbc3/c0;Lec3/a2;I)Lec3/q1;

    move-result-object p1

    iput-object p1, p0, Llm0/a;->e:Lec3/l;

    return-void
.end method

.method public synthetic constructor <init>(Landroid/content/Context;Landroid/content/IntentFilter;Landroid/bluetooth/BluetoothAdapter;Lbc3/c0;Llm0/e;ILkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 6

    and-int/lit8 p6, p6, 0x10

    if-eqz p6, :cond_0

    .line 9
    new-instance p5, Llm0/e;

    invoke-direct {p5}, Llm0/e;-><init>()V

    :cond_0
    move-object v0, p0

    move-object v1, p1

    move-object v2, p2

    move-object v3, p3

    move-object v4, p4

    move-object v5, p5

    .line 10
    invoke-direct/range {v0 .. v5}, Llm0/a;-><init>(Landroid/content/Context;Landroid/content/IntentFilter;Landroid/bluetooth/BluetoothAdapter;Lbc3/c0;Llm0/e;)V

    return-void
.end method

.method public static final synthetic a(Llm0/a;)Landroid/bluetooth/BluetoothAdapter;
    .locals 0

    iget-object p0, p0, Llm0/a;->c:Landroid/bluetooth/BluetoothAdapter;

    return-object p0
.end method

.method public static final synthetic b(Llm0/a;)Landroid/content/Context;
    .locals 0

    iget-object p0, p0, Llm0/a;->a:Landroid/content/Context;

    return-object p0
.end method

.method public static final synthetic c(Llm0/a;)Landroid/content/IntentFilter;
    .locals 0

    iget-object p0, p0, Llm0/a;->b:Landroid/content/IntentFilter;

    return-object p0
.end method


# virtual methods
.method public final d()Lec3/l;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lec3/l;"
        }
    .end annotation

    iget-object v0, p0, Llm0/a;->e:Lec3/l;

    return-object v0
.end method
