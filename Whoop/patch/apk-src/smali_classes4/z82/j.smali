.class public final Lz82/j;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0010\u000b\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0004\n\u0002\u0018\u0002\n\u0002\u0008\u0004\n\u0002\u0010\u0008\n\u0002\u0008\u0006\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u00a2\u0006\u0004\u0008\u0004\u0010\u0005J\r\u0010\u0007\u001a\u00020\u0006\u00a2\u0006\u0004\u0008\u0007\u0010\u0008J\r\u0010\n\u001a\u00020\t\u00a2\u0006\u0004\u0008\n\u0010\u000bR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u000c\u0010\rR\u001b\u0010\u0012\u001a\u00020\u000e8BX\u0082\u0084\u0002\u00a2\u0006\u000c\n\u0004\u0008\u000f\u0010\u0010\u001a\u0004\u0008\u000c\u0010\u0011R$\u0010\u0018\u001a\u00020\u00132\u0006\u0010\u0014\u001a\u00020\u00138F@BX\u0086\u000e\u00a2\u0006\u000c\u001a\u0004\u0008\u000f\u0010\u0015\"\u0004\u0008\u0016\u0010\u0017\u00a8\u0006\u0019"
    }
    d2 = {
        "Lz82/j;",
        "",
        "Lu92/d;",
        "mainPrefs",
        "<init>",
        "(Lu92/d;)V",
        "",
        "d",
        "()Z",
        "Ll83/a0;",
        "c",
        "()V",
        "a",
        "Lu92/d;",
        "Loh3/d;",
        "b",
        "Lq92/b;",
        "()Loh3/d;",
        "log",
        "",
        "value",
        "()I",
        "e",
        "(I)V",
        "onboardingCounter",
        "core_release"
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
.field static final synthetic c:[Lj93/z;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "[",
            "Lj93/z;"
        }
    .end annotation
.end field


# instance fields
.field private final a:Lu92/d;

.field private final b:Lq92/b;


# direct methods
.method static constructor <clinit>()V
    .locals 5

    new-instance v0, Lkotlin/jvm/internal/x;

    const-class v1, Lz82/j;

    const-string v2, "log"

    const-string v3, "getLog()Ltimber/log/Timber$Tree;"

    const/4 v4, 0x0

    invoke-direct {v0, v1, v2, v3, v4}, Lkotlin/jvm/internal/x;-><init>(Ljava/lang/Class;Ljava/lang/String;Ljava/lang/String;I)V

    sget-object v1, Lkotlin/jvm/internal/h0;->a:Lkotlin/jvm/internal/i0;

    invoke-virtual {v1, v0}, Lkotlin/jvm/internal/i0;->property1(Lkotlin/jvm/internal/w;)Lj93/w;

    move-result-object v0

    const/4 v1, 0x1

    new-array v1, v1, [Lj93/z;

    aput-object v0, v1, v4

    sput-object v1, Lz82/j;->c:[Lj93/z;

    return-void
.end method

.method public constructor <init>(Lu92/d;)V
    .locals 1

    const-string v0, "mainPrefs"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lz82/j;->a:Lu92/d;

    new-instance p1, Lq92/b;

    const-string v0, "OnboardingTracker"

    invoke-direct {p1, v0}, Lq92/b;-><init>(Ljava/lang/String;)V

    iput-object p1, p0, Lz82/j;->b:Lq92/b;

    return-void
.end method

.method private final a()Loh3/d;
    .locals 3

    iget-object v0, p0, Lz82/j;->b:Lq92/b;

    sget-object v1, Lz82/j;->c:[Lj93/z;

    const/4 v2, 0x0

    aget-object v1, v1, v2

    invoke-virtual {v0, p0, v1}, Lq92/b;->a(Ljava/lang/Object;Lj93/z;)Loh3/d;

    move-result-object v0

    return-object v0
.end method

.method private final e(I)V
    .locals 2

    iget-object v0, p0, Lz82/j;->a:Lu92/d;

    const-string v1, "onboardingCounter"

    invoke-virtual {v0, v1, p1}, Lu92/d;->t(Ljava/lang/String;I)V

    return-void
.end method


# virtual methods
.method public final b()I
    .locals 3

    iget-object v0, p0, Lz82/j;->a:Lu92/d;

    const-string v1, "onboardingCounter"

    const/4 v2, 0x0

    invoke-virtual {v0, v1, v2}, Lu92/d;->h(Ljava/lang/String;I)I

    move-result v0

    return v0
.end method

.method public final c()V
    .locals 3

    invoke-virtual {p0}, Lz82/j;->b()I

    move-result v0

    add-int/lit8 v0, v0, 0x1

    invoke-direct {p0, v0}, Lz82/j;->e(I)V

    invoke-direct {p0}, Lz82/j;->a()Loh3/d;

    move-result-object v0

    invoke-virtual {p0}, Lz82/j;->b()I

    move-result v1

    const-string v2, "After incrementing, current count is "

    invoke-static {v1, v2}, Lb9/y;->h(ILjava/lang/String;)Ljava/lang/String;

    move-result-object v1

    const/4 v2, 0x0

    new-array v2, v2, [Ljava/lang/Object;

    invoke-virtual {v0, v1, v2}, Loh3/d;->a(Ljava/lang/String;[Ljava/lang/Object;)V

    return-void
.end method

.method public final d()Z
    .locals 7

    invoke-direct {p0}, Lz82/j;->a()Loh3/d;

    move-result-object v0

    invoke-virtual {p0}, Lz82/j;->b()I

    move-result v1

    invoke-virtual {p0}, Lz82/j;->b()I

    move-result v2

    const/4 v3, 0x0

    const/4 v4, 0x1

    if-ne v2, v4, :cond_0

    move v2, v4

    goto :goto_0

    :cond_0
    move v2, v3

    :goto_0
    new-instance v5, Ljava/lang/StringBuilder;

    const-string v6, "Current counter is "

    invoke-direct {v5, v6}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v5, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v1, ". Returning "

    invoke-virtual {v5, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v5, v2}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    invoke-virtual {v5}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    new-array v2, v3, [Ljava/lang/Object;

    invoke-virtual {v0, v1, v2}, Loh3/d;->a(Ljava/lang/String;[Ljava/lang/Object;)V

    invoke-virtual {p0}, Lz82/j;->b()I

    move-result v0

    if-ne v0, v4, :cond_1

    return v4

    :cond_1
    return v3
.end method
