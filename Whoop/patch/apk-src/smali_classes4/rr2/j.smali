.class public final Lrr2/j;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lof3/a;


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0006\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0004\u0008\u00c7\u0002\u0018\u00002\u00020\u0001B\t\u0008\u0002\u00a2\u0006\u0004\u0008\u0002\u0010\u0003J\u0015\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004\u00a2\u0006\u0004\u0008\u0007\u0010\u0008J\r\u0010\n\u001a\u00020\t\u00a2\u0006\u0004\u0008\n\u0010\u0003R\u0016\u0010\u000e\u001a\u00020\u000b8\u0002@\u0002X\u0082\u000e\u00a2\u0006\u0006\n\u0004\u0008\u000c\u0010\r\u00a8\u0006\u000f"
    }
    d2 = {
        "Lrr2/j;",
        "Lof3/a;",
        "<init>",
        "()V",
        "Lio/sentry/y3;",
        "context",
        "",
        "a",
        "(Lio/sentry/y3;)D",
        "Ll83/a0;",
        "b",
        "Lrr2/i;",
        "x",
        "Lrr2/i;",
        "sampleRate",
        "app_prodStandardRelease"
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
.field public static final w:Lrr2/j;

.field private static x:Lrr2/i;

.field public static final y:I


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Lrr2/j;

    invoke-direct {v0}, Lrr2/j;-><init>()V

    sput-object v0, Lrr2/j;->w:Lrr2/j;

    sget-object v0, Lrr2/b;->a:Lrr2/b;

    sput-object v0, Lrr2/j;->x:Lrr2/i;

    const/16 v0, 0x8

    sput v0, Lrr2/j;->y:I

    return-void
.end method

.method private constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final a(Lio/sentry/y3;)D
    .locals 2

    const-string v0, "context"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object v0, Lrr2/j;->x:Lrr2/i;

    invoke-interface {v0, p1}, Lrr2/i;->a(Lio/sentry/y3;)D

    move-result-wide v0

    return-wide v0
.end method

.method public final b()V
    .locals 3

    invoke-interface {p0}, Lof3/a;->getKoin()Lnf3/a;

    move-result-object v0

    iget-object v0, v0, Lnf3/a;->a:Lwf3/a;

    iget-object v0, v0, Lwf3/a;->d:Lxf3/c;

    const-class v1, Ljs0/c;

    sget-object v2, Lkotlin/jvm/internal/h0;->a:Lkotlin/jvm/internal/i0;

    invoke-virtual {v2, v1}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object v1

    const/4 v2, 0x0

    invoke-virtual {v0, v2, v1, v2}, Lxf3/c;->a(Lc93/a;Lj93/d;Lvf3/a;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljs0/c;

    new-instance v1, Lrr2/f;

    invoke-direct {v1, v0}, Lrr2/f;-><init>(Ljs0/c;)V

    sput-object v1, Lrr2/j;->x:Lrr2/i;

    return-void
.end method

.method public bridge getKoin()Lnf3/a;
    .locals 1

    invoke-static {p0}, Lts/o;->A(Lof3/a;)Lnf3/a;

    move-result-object v0

    return-object v0
.end method
