.class public final Lod0/b;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lod0/b$a;
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0005\u0008\u0007\u0018\u0000 \u000c2\u00020\u0001:\u0001\tB\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u00a2\u0006\u0004\u0008\u0004\u0010\u0005J\u0015\u0010\t\u001a\u00020\u00082\u0006\u0010\u0007\u001a\u00020\u0006\u00a2\u0006\u0004\u0008\t\u0010\nR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\t\u0010\u000b\u00a8\u0006\r"
    }
    d2 = {
        "Lod0/b;",
        "",
        "Lfi0/a;",
        "analytics",
        "<init>",
        "(Lfi0/a;)V",
        "Lod0/a;",
        "event",
        "Ll83/a0;",
        "a",
        "(Lod0/a;)V",
        "Lfi0/a;",
        "b",
        "advanced-labs_release"
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
.field public static final b:Lod0/b$a;

.field public static final c:I


# instance fields
.field private final a:Lfi0/a;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, Lod0/b$a;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lod0/b$a;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    sput-object v0, Lod0/b;->b:Lod0/b$a;

    const/16 v0, 0x8

    sput v0, Lod0/b;->c:I

    return-void
.end method

.method public constructor <init>(Lfi0/a;)V
    .locals 1

    const-string v0, "analytics"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lod0/b;->a:Lfi0/a;

    return-void
.end method


# virtual methods
.method public final a(Lod0/a;)V
    .locals 11

    const-string v0, "event"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    instance-of v0, p1, Lod0/a$a;

    const-string v1, "screen"

    if-eqz v0, :cond_0

    iget-object v2, p0, Lod0/b;->a:Lfi0/a;

    check-cast p1, Lod0/a$a;

    invoke-virtual {p1}, Lod0/a$a;->a()Ljava/lang/String;

    move-result-object v4

    invoke-virtual {p1}, Lod0/a$a;->b()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {p1}, Lod0/a$a;->c()Ljava/lang/String;

    move-result-object p1

    invoke-static {v1, p1}, Lr80/c;->u(Ljava/lang/String;Ljava/lang/String;)Ljava/util/Map;

    move-result-object v8

    const/16 v9, 0x14

    const/4 v10, 0x0

    const/4 v5, 0x0

    const-string v6, "Bloodwork"

    const/4 v7, 0x0

    invoke-static/range {v2 .. v10}, Lfi0/a;->i(Lfi0/a;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/Map;ILjava/lang/Object;)V

    return-void

    :cond_0
    instance-of v0, p1, Lod0/a$b;

    if-eqz v0, :cond_1

    iget-object v2, p0, Lod0/b;->a:Lfi0/a;

    check-cast p1, Lod0/a$b;

    invoke-virtual {p1}, Lod0/a$b;->a()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {p1}, Lod0/a$b;->b()Ljava/lang/String;

    move-result-object p1

    invoke-static {v1, p1}, Lr80/c;->u(Ljava/lang/String;Ljava/lang/String;)Ljava/util/Map;

    move-result-object v8

    const/16 v9, 0x14

    const/4 v10, 0x0

    const-string v4, "view"

    const/4 v5, 0x0

    const-string v6, "Bloodwork"

    const/4 v7, 0x0

    invoke-static/range {v2 .. v10}, Lfi0/a;->i(Lfi0/a;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/Map;ILjava/lang/Object;)V

    return-void

    :cond_1
    new-instance p1, Lkotlin/NoWhenBranchMatchedException;

    invoke-direct {p1}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    throw p1
.end method
