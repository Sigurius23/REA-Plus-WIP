.class public final Lkd1/w;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0005\u0008\u00c7\u0002\u0018\u00002\u00020\u0001B\t\u0008\u0002\u00a2\u0006\u0004\u0008\u0002\u0010\u0003J\r\u0010\u0005\u001a\u00020\u0004\u00a2\u0006\u0004\u0008\u0005\u0010\u0006J\r\u0010\u0007\u001a\u00020\u0004\u00a2\u0006\u0004\u0008\u0007\u0010\u0006J\r\u0010\u0008\u001a\u00020\u0004\u00a2\u0006\u0004\u0008\u0008\u0010\u0006\u00a8\u0006\t"
    }
    d2 = {
        "Lkd1/w;",
        "",
        "<init>",
        "()V",
        "Lk91/a;",
        "c",
        "()Lk91/a;",
        "b",
        "a",
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


# static fields
.field public static final a:Lkd1/w;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Lkd1/w;

    invoke-direct {v0}, Lkd1/w;-><init>()V

    sput-object v0, Lkd1/w;->a:Lkd1/w;

    return-void
.end method

.method private constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final a()Lk91/a;
    .locals 3

    sget-object v0, Lk91/a;->e:Lk91/a$a;

    const/4 v1, 0x3

    int-to-float v1, v1

    const/4 v2, 0x4

    int-to-float v2, v2

    mul-float/2addr v1, v2

    invoke-virtual {v0, v1}, Lk91/a$a;->a(F)Lk91/a;

    move-result-object v0

    return-object v0
.end method

.method public final b()Lk91/a;
    .locals 3

    sget-object v0, Lk91/a;->e:Lk91/a$a;

    const/4 v1, 0x2

    int-to-float v1, v1

    const/4 v2, 0x4

    int-to-float v2, v2

    mul-float/2addr v1, v2

    invoke-virtual {v0, v1}, Lk91/a$a;->a(F)Lk91/a;

    move-result-object v0

    return-object v0
.end method

.method public final c()Lk91/a;
    .locals 3

    sget-object v0, Lk91/a;->e:Lk91/a$a;

    const/4 v1, 0x1

    int-to-float v1, v1

    const/4 v2, 0x4

    int-to-float v2, v2

    mul-float/2addr v1, v2

    invoke-virtual {v0, v1}, Lk91/a$a;->a(F)Lk91/a;

    move-result-object v0

    return-object v0
.end method
