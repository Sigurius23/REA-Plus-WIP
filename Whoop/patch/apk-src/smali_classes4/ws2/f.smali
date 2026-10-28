.class public final Lws2/f;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lws2/f$a;
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0008\n\u0002\u0008\u0004\u0008\u0007\u0018\u0000 \u00082\u00020\u0001:\u0001\u0008B\u0007\u00a2\u0006\u0004\u0008\u0002\u0010\u0003J\u001d\u0010\u0008\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006\u00a2\u0006\u0004\u0008\u0008\u0010\t\u00a8\u0006\n"
    }
    d2 = {
        "Lws2/f;",
        "",
        "<init>",
        "()V",
        "Lws2/g;",
        "prevState",
        "",
        "changeValue",
        "a",
        "(Lws2/g;I)Lws2/g;",
        "weekly-plan_release"
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
.field public static final a:Lws2/f$a;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, Lws2/f$a;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lws2/f$a;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    sput-object v0, Lws2/f;->a:Lws2/f$a;

    return-void
.end method

.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final a(Lws2/g;I)Lws2/g;
    .locals 6

    const-string v0, "prevState"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, Lws2/g;

    invoke-virtual {p1}, Lws2/g;->a()I

    move-result v1

    add-int/2addr v1, p2

    invoke-virtual {p1}, Lws2/g;->b()I

    move-result v2

    const/4 v3, 0x1

    sub-int/2addr v2, v3

    const/4 v4, 0x0

    invoke-static {v1, v4, v2}, Le93/b;->n(III)I

    move-result v1

    invoke-virtual {p1}, Lws2/g;->b()I

    move-result v2

    invoke-virtual {p1}, Lws2/g;->a()I

    move-result v5

    add-int/2addr v5, p2

    invoke-virtual {p1}, Lws2/g;->b()I

    move-result p2

    sub-int/2addr p2, v3

    invoke-static {v5, v4, p2}, Le93/b;->n(III)I

    move-result p2

    invoke-virtual {p1}, Lws2/g;->b()I

    move-result p1

    sub-int/2addr p1, v3

    if-ne p2, p1, :cond_0

    goto :goto_0

    :cond_0
    move v3, v4

    :goto_0
    invoke-direct {v0, v1, v2, v3}, Lws2/g;-><init>(IIZ)V

    return-object v0
.end method
