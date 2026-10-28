.class public final Lg32/o$a;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lg32/o;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "a"
.end annotation

.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lg32/o$a$a;
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\u0008\u0003\u0008\u0086\u0003\u0018\u00002\u00020\u0001:\u0001\u0005B\t\u0008\u0002\u00a2\u0006\u0004\u0008\u0002\u0010\u0003J\r\u0010\u0005\u001a\u00020\u0004\u00a2\u0006\u0004\u0008\u0005\u0010\u0006R \u0010\n\u001a\u000e\u0012\u0004\u0012\u00020\u0008\u0012\u0004\u0012\u00020\t0\u00078\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\n\u0010\u000b\u00a8\u0006\u000c"
    }
    d2 = {
        "Lg32/o$a;",
        "",
        "<init>",
        "()V",
        "Lh20/h1;",
        "a",
        "()Lh20/h1;",
        "",
        "",
        "Lh20/e2;",
        "GOOGLE_PAY_BUTTON_TYPES",
        "Ljava/util/Map;",
        "payments_release"
    }
    k = 0x1
    mv = {
        0x2,
        0x3,
        0x0
    }
    xi = 0x30
.end annotation


# direct methods
.method private constructor <init>()V
    .locals 0

    .line 2
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public synthetic constructor <init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Lg32/o$a;-><init>()V

    return-void
.end method


# virtual methods
.method public final a()Lh20/h1;
    .locals 10

    sget-object v0, Lg32/o$a$a;->a:Lg32/o$a$a;

    invoke-virtual {v0}, Lg32/o$a$a;->a()Lh20/v1;

    move-result-object v2

    invoke-virtual {v0}, Lg32/o$a$a;->a()Lh20/v1;

    move-result-object v3

    new-instance v6, Lh20/y2;

    invoke-virtual {v0}, Lg32/o$a$a;->b()Lh20/z2;

    move-result-object v1

    invoke-virtual {v0}, Lg32/o$a$a;->b()Lh20/z2;

    move-result-object v0

    new-instance v4, Lh20/a3;

    const/4 v5, 0x4

    int-to-float v7, v5

    mul-float v8, v7, v7

    invoke-static {v8}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    move-result-object v8

    invoke-direct {v4, v5, v8}, Lh20/a3;-><init>(ILjava/lang/Float;)V

    const/16 v5, 0xd

    invoke-static {v5}, Lv63/c;->h(I)J

    move-result-wide v8

    invoke-static {v8, v9}, Ly3/o;->c(J)F

    move-result v5

    sget v8, Lgy0/b;->a:I

    new-instance v9, Lh20/b3;

    invoke-static {v8}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v8

    invoke-static {v5}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    move-result-object v5

    invoke-direct {v9, v8, v5}, Lh20/b3;-><init>(Ljava/lang/Integer;Ljava/lang/Float;)V

    invoke-direct {v6, v1, v0, v4, v9}, Lh20/y2;-><init>(Lh20/z2;Lh20/z2;Lh20/a3;Lh20/b3;)V

    new-instance v5, Lh20/l3;

    sget v0, Lgy0/b;->a:I

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    invoke-direct {v5, v0}, Lh20/l3;-><init>(Ljava/lang/Integer;)V

    new-instance v4, Lh20/c3;

    const/4 v0, 0x3

    int-to-float v0, v0

    mul-float/2addr v0, v7

    const/4 v1, 0x0

    invoke-direct {v4, v0, v1, v0}, Lh20/c3;-><init>(FFF)V

    new-instance v1, Lh20/h1;

    invoke-direct/range {v1 .. v6}, Lh20/h1;-><init>(Lh20/v1;Lh20/v1;Lh20/c3;Lh20/l3;Lh20/y2;)V

    return-object v1
.end method
