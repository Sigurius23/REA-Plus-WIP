.class public final Lkk0/a;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lkk0/a$a;
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000J\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0008\u0002\n\u0002\u0010\u0005\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0004\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0010\u000e\n\u0002\u0008\t\n\u0002\u0018\u0002\n\u0002\u0008\u0004\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0010\u000b\n\u0002\u0008\u0006\u0018\u0000 #2\u00020\u0001:\u0001\u0015B\u0007\u00a2\u0006\u0004\u0008\u0002\u0010\u0003J\u0015\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004\u00a2\u0006\u0004\u0008\u0007\u0010\u0008J\u0015\u0010\t\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0000\u00a2\u0006\u0004\u0008\t\u0010\nJ\u0013\u0010\u000c\u001a\u0008\u0012\u0004\u0012\u00020\u00040\u000b\u00a2\u0006\u0004\u0008\u000c\u0010\rJ\u0013\u0010\u000f\u001a\u0008\u0012\u0004\u0012\u00020\u00040\u000e\u00a2\u0006\u0004\u0008\u000f\u0010\u0010J\u000f\u0010\u0012\u001a\u00020\u0011H\u0016\u00a2\u0006\u0004\u0008\u0012\u0010\u0013R*\u0010\u001a\u001a\u00020\u00042\u0006\u0010\u0014\u001a\u00020\u00048\u0006@BX\u0087\u000e\u00a2\u0006\u0012\n\u0004\u0008\u0015\u0010\u0016\u0012\u0004\u0008\u0019\u0010\u0003\u001a\u0004\u0008\u0017\u0010\u0018R\"\u0010\u001f\u001a\u0010\u0012\u000c\u0012\n \u001c*\u0004\u0018\u00010\u00000\u00000\u001b8\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u001d\u0010\u001eR\u001a\u0010\"\u001a\u0008\u0012\u0004\u0012\u00020\u00000 8\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\t\u0010!R\u0011\u0010\u0005\u001a\u00020\u00048F\u00a2\u0006\u0006\u001a\u0004\u0008#\u0010\u0018R\u0011\u0010\'\u001a\u00020$8F\u00a2\u0006\u0006\u001a\u0004\u0008%\u0010&R\u0011\u0010)\u001a\u00020$8F\u00a2\u0006\u0006\u001a\u0004\u0008(\u0010&\u00a8\u0006*"
    }
    d2 = {
        "Lkk0/a;",
        "",
        "<init>",
        "()V",
        "",
        "level",
        "Ll83/a0;",
        "m",
        "(B)V",
        "c",
        "(Lkk0/a;)V",
        "Lec3/l;",
        "e",
        "()Lec3/l;",
        "Lxg3/g;",
        "j",
        "()Lxg3/g;",
        "",
        "toString",
        "()Ljava/lang/String;",
        "value",
        "a",
        "B",
        "f",
        "()B",
        "getUserDisplayPercent$annotations",
        "userDisplayPercent",
        "Lze1/d;",
        "kotlin.jvm.PlatformType",
        "b",
        "Lze1/d;",
        "updateSubject",
        "Lec3/o1;",
        "Lec3/o1;",
        "batteryLevelFlow",
        "d",
        "",
        "h",
        "()Z",
        "isLowForFirmwareUpdate",
        "g",
        "isLow",
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


# static fields
.field public static final d:Lkk0/a$a;


# instance fields
.field private a:B

.field private final b:Lze1/d;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lze1/d<",
            "Lkk0/a;",
            ">;"
        }
    .end annotation
.end field

.field private final c:Lec3/o1;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lec3/o1;"
        }
    .end annotation
.end field


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, Lkk0/a$a;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lkk0/a$a;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    sput-object v0, Lkk0/a;->d:Lkk0/a$a;

    return-void
.end method

.method public constructor <init>()V
    .locals 5

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/16 v0, 0x32

    iput-byte v0, p0, Lkk0/a;->a:B

    invoke-static {}, Lze1/d;->Y()Lze1/d;

    move-result-object v1

    const-string v2, "createSingle(...)"

    invoke-static {v1, v2}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    iput-object v1, p0, Lkk0/a;->b:Lze1/d;

    sget-object v1, Ldc3/a;->x:Ldc3/a;

    const/4 v2, 0x2

    const/4 v3, 0x1

    const/4 v4, 0x0

    invoke-static {v3, v4, v1, v2}, Lec3/v;->b(IILdc3/a;I)Lec3/w1;

    move-result-object v1

    iput-object v1, p0, Lkk0/a;->c:Lec3/o1;

    invoke-virtual {p0, v0}, Lkk0/a;->m(B)V

    return-void
.end method

.method public static synthetic a(Lkk0/a;)Ljava/lang/Byte;
    .locals 0

    invoke-static {p0}, Lkk0/a;->k(Lkk0/a;)Ljava/lang/Byte;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic b(Lkg2/e;Ljava/lang/Object;)Ljava/lang/Byte;
    .locals 0

    invoke-static {p0, p1}, Lkk0/a;->l(Lkotlin/jvm/functions/Function1;Ljava/lang/Object;)Ljava/lang/Byte;

    move-result-object p0

    return-object p0
.end method

.method public static final i(B)Z
    .locals 1

    sget-object v0, Lkk0/a;->d:Lkk0/a$a;

    invoke-virtual {v0, p0}, Lkk0/a$a;->b(B)Z

    move-result p0

    return p0
.end method

.method private static final k(Lkk0/a;)Ljava/lang/Byte;
    .locals 1

    const-string v0, "obj"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p0}, Lkk0/a;->d()B

    move-result p0

    invoke-static {p0}, Ljava/lang/Byte;->valueOf(B)Ljava/lang/Byte;

    move-result-object p0

    return-object p0
.end method

.method private static final l(Lkotlin/jvm/functions/Function1;Ljava/lang/Object;)Ljava/lang/Byte;
    .locals 0

    invoke-interface {p0, p1}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Ljava/lang/Byte;

    return-object p0
.end method


# virtual methods
.method public final c(Lkk0/a;)V
    .locals 1

    const-string v0, "level"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p1}, Lkk0/a;->d()B

    move-result p1

    invoke-virtual {p0, p1}, Lkk0/a;->m(B)V

    return-void
.end method

.method public final d()B
    .locals 1

    iget-byte v0, p0, Lkk0/a;->a:B

    return v0
.end method

.method public final e()Lec3/l;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lec3/l;"
        }
    .end annotation

    iget-object v0, p0, Lkk0/a;->c:Lec3/o1;

    invoke-static {v0}, Lec3/v;->g(Lec3/o1;)Lec3/q1;

    move-result-object v0

    new-instance v1, Lkk0/a$b;

    invoke-direct {v1, v0}, Lkk0/a$b;-><init>(Lec3/l;)V

    return-object v1
.end method

.method public final f()B
    .locals 1

    iget-byte v0, p0, Lkk0/a;->a:B

    return v0
.end method

.method public final g()Z
    .locals 2

    sget-object v0, Lkk0/a;->d:Lkk0/a$a;

    iget-byte v1, p0, Lkk0/a;->a:B

    invoke-virtual {v0, v1}, Lkk0/a$a;->b(B)Z

    move-result v0

    return v0
.end method

.method public final h()Z
    .locals 2

    iget-byte v0, p0, Lkk0/a;->a:B

    const/16 v1, 0x14

    if-ge v0, v1, :cond_0

    const/4 v0, 0x1

    return v0

    :cond_0
    const/4 v0, 0x0

    return v0
.end method

.method public final j()Lxg3/g;
    .locals 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lxg3/g<",
            "Ljava/lang/Byte;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lkk0/a;->b:Lze1/d;

    new-instance v1, Lkg2/e;

    const/4 v2, 0x4

    invoke-direct {v1, v2}, Lkg2/e;-><init>(I)V

    new-instance v2, Lcom/whoop/data/repositories/c;

    const/16 v3, 0x10

    invoke-direct {v2, v1, v3}, Lcom/whoop/data/repositories/c;-><init>(Ljava/lang/Object;I)V

    invoke-virtual {v0, v2}, Lxg3/g;->x(Lbh3/g;)Lxg3/g;

    move-result-object v0

    const-string v1, "map(...)"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    return-object v0
.end method

.method public final m(B)V
    .locals 0

    iput-byte p1, p0, Lkk0/a;->a:B

    iget-object p1, p0, Lkk0/a;->b:Lze1/d;

    invoke-virtual {p1, p0}, Llh3/j;->onNext(Ljava/lang/Object;)V

    iget-object p1, p0, Lkk0/a;->c:Lec3/o1;

    invoke-interface {p1, p0}, Lec3/o1;->a(Ljava/lang/Object;)Z

    return-void
.end method

.method public toString()Ljava/lang/String;
    .locals 2

    iget-byte v0, p0, Lkk0/a;->a:B

    const-string v1, "BatteryLevel="

    invoke-static {v0, v1}, Lb9/y;->h(ILjava/lang/String;)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
