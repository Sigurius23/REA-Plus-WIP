.class public final Llb2/b;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Llb2/b$a;
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0005\u0008\u0007\u0018\u0000 \u000c2\u00020\u0001:\u0001\tB\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u00a2\u0006\u0004\u0008\u0004\u0010\u0005J\u0015\u0010\t\u001a\u00020\u00082\u0006\u0010\u0007\u001a\u00020\u0006\u00a2\u0006\u0004\u0008\t\u0010\nR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\t\u0010\u000b\u00a8\u0006\r"
    }
    d2 = {
        "Llb2/b;",
        "",
        "Lfi0/a;",
        "analytics",
        "<init>",
        "(Lfi0/a;)V",
        "Llb2/a;",
        "event",
        "Ll83/a0;",
        "a",
        "(Llb2/a;)V",
        "Lfi0/a;",
        "b",
        "settings_release"
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
.field public static final b:Llb2/b$a;

.field public static final c:I


# instance fields
.field private final a:Lfi0/a;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, Llb2/b$a;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Llb2/b$a;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    sput-object v0, Llb2/b;->b:Llb2/b$a;

    const/16 v0, 0x8

    sput v0, Llb2/b;->c:I

    return-void
.end method

.method public constructor <init>(Lfi0/a;)V
    .locals 1

    const-string v0, "analytics"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Llb2/b;->a:Lfi0/a;

    return-void
.end method


# virtual methods
.method public final a(Llb2/a;)V
    .locals 10

    const-string v0, "event"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p1}, Llb2/a;->e()Ljava/lang/String;

    move-result-object v0

    if-eqz v0, :cond_2

    invoke-interface {v0}, Ljava/lang/CharSequence;->length()I

    move-result v0

    if-nez v0, :cond_0

    goto :goto_0

    :cond_0
    invoke-virtual {p1}, Llb2/a;->d()Ljava/util/Map;

    move-result-object v0

    if-nez v0, :cond_1

    sget-object v0, Lm83/z;->w:Lm83/z;

    :cond_1
    invoke-virtual {p1}, Llb2/a;->e()Ljava/lang/String;

    move-result-object v1

    new-instance v2, Ll83/k;

    const-string v3, "active_promotion"

    invoke-direct {v2, v3, v1}, Ll83/k;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    invoke-static {v0, v2}, Lm83/g0;->e0(Ljava/util/Map;Ll83/k;)Ljava/util/Map;

    move-result-object v0

    invoke-virtual {p1, v0}, Llb2/a;->f(Ljava/util/Map;)V

    :cond_2
    :goto_0
    iget-object v1, p0, Llb2/b;->a:Lfi0/a;

    invoke-virtual {p1}, Llb2/a;->b()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {p1}, Llb2/a;->c()Ljava/lang/String;

    move-result-object v5

    invoke-virtual {p1}, Llb2/a;->a()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {p1}, Llb2/a;->d()Ljava/util/Map;

    move-result-object v7

    const/16 v8, 0x14

    const/4 v9, 0x0

    const/4 v4, 0x0

    const/4 v6, 0x0

    invoke-static/range {v1 .. v9}, Lfi0/a;->i(Lfi0/a;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/Map;ILjava/lang/Object;)V

    return-void
.end method
