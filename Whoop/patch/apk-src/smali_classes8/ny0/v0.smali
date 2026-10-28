.class public abstract Lny0/v0;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lny0/v0$a;,
        Lny0/v0$b;,
        Lny0/v0$c;,
        Lny0/v0$d;
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u000b\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u00087\u0018\u00002\u00020\u0001:\u0004\r\n\u000c\u0008B%\u0008\u0004\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0008\u0008\u0002\u0010\u0004\u001a\u00020\u0002\u0012\u0008\u0008\u0002\u0010\u0005\u001a\u00020\u0002\u00a2\u0006\u0004\u0008\u0006\u0010\u0007R\u0017\u0010\u0003\u001a\u00020\u00028\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0008\u0010\t\u001a\u0004\u0008\n\u0010\u000bR\u0017\u0010\u0004\u001a\u00020\u00028\u0006\u00a2\u0006\u000c\n\u0004\u0008\u000c\u0010\t\u001a\u0004\u0008\u000c\u0010\u000bR\u0017\u0010\u0005\u001a\u00020\u00028\u0006\u00a2\u0006\u000c\n\u0004\u0008\n\u0010\t\u001a\u0004\u0008\r\u0010\u000bR\u0014\u0010\u0010\u001a\u00020\u000e8&X\u00a6\u0004\u00a2\u0006\u0006\u001a\u0004\u0008\u0008\u0010\u000f\u0082\u0001\u0004\u0011\u0012\u0013\u0014\u00a8\u0006\u0015"
    }
    d2 = {
        "Lny0/v0;",
        "",
        "Lb91/a;",
        "settingStyle",
        "settingLabelStyle",
        "supportStyle",
        "<init>",
        "(Lb91/a;Lb91/a;Lb91/a;)V",
        "a",
        "Lb91/a;",
        "c",
        "()Lb91/a;",
        "b",
        "d",
        "Ll0/k1;",
        "()Ll0/k1;",
        "padding",
        "Lny0/v0$a;",
        "Lny0/v0$b;",
        "Lny0/v0$c;",
        "Lny0/v0$d;",
        "design_release"
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
.field private final a:Lb91/a;

.field private final b:Lb91/a;

.field private final c:Lb91/a;


# direct methods
.method private constructor <init>(Lb91/a;Lb91/a;Lb91/a;)V
    .locals 0

    .line 2
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 3
    iput-object p1, p0, Lny0/v0;->a:Lb91/a;

    .line 4
    iput-object p2, p0, Lny0/v0;->b:Lb91/a;

    .line 5
    iput-object p3, p0, Lny0/v0;->c:Lb91/a;

    return-void
.end method

.method public synthetic constructor <init>(Lb91/a;Lb91/a;Lb91/a;ILkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 0

    and-int/lit8 p5, p4, 0x2

    if-eqz p5, :cond_0

    .line 6
    invoke-static {}, Lb91/e;->e()Lb91/d;

    move-result-object p2

    invoke-virtual {p2}, Lb91/d;->s()Lb91/a;

    move-result-object p2

    :cond_0
    and-int/lit8 p4, p4, 0x4

    if-eqz p4, :cond_1

    .line 7
    invoke-static {}, Lb91/e;->e()Lb91/d;

    move-result-object p3

    invoke-virtual {p3}, Lb91/d;->d()Lb91/a;

    move-result-object p3

    :cond_1
    const/4 p4, 0x0

    .line 8
    invoke-direct {p0, p1, p2, p3, p4}, Lny0/v0;-><init>(Lb91/a;Lb91/a;Lb91/a;Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    return-void
.end method

.method public synthetic constructor <init>(Lb91/a;Lb91/a;Lb91/a;Lkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 0

    .line 1
    invoke-direct {p0, p1, p2, p3}, Lny0/v0;-><init>(Lb91/a;Lb91/a;Lb91/a;)V

    return-void
.end method


# virtual methods
.method public abstract a()Ll0/k1;
.end method

.method public final b()Lb91/a;
    .locals 1

    iget-object v0, p0, Lny0/v0;->b:Lb91/a;

    return-object v0
.end method

.method public final c()Lb91/a;
    .locals 1

    iget-object v0, p0, Lny0/v0;->a:Lb91/a;

    return-object v0
.end method

.method public final d()Lb91/a;
    .locals 1

    iget-object v0, p0, Lny0/v0;->c:Lb91/a;

    return-object v0
.end method
