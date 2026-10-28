.class public final Lxu2/d$a;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lxu2/d;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "a"
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0006\u0008\u0086\u0003\u0018\u00002\u00020\u0001B\t\u0008\u0002\u00a2\u0006\u0004\u0008\u0002\u0010\u0003R\u0017\u0010\t\u001a\u00020\u00048\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0005\u0010\u0006\u001a\u0004\u0008\u0007\u0010\u0008\u00a8\u0006\n"
    }
    d2 = {
        "Lxu2/d$a;",
        "",
        "<init>",
        "()V",
        "Lxu2/d$b;",
        "b",
        "Lxu2/d$b;",
        "a",
        "()Lxu2/d$b;",
        "initial",
        "weightlifting_release"
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
.field static final synthetic a:Lxu2/d$a;

.field private static final b:Lxu2/d$b;


# direct methods
.method static constructor <clinit>()V
    .locals 10

    new-instance v0, Lxu2/d$a;

    invoke-direct {v0}, Lxu2/d$a;-><init>()V

    sput-object v0, Lxu2/d$a;->a:Lxu2/d$a;

    new-instance v4, Lxu2/a$b;

    const/4 v0, 0x1

    invoke-direct {v4, v0}, Lxu2/a$b;-><init>(Z)V

    sget-object v6, Lhu2/b$c;->w:Lhu2/b$c;

    new-instance v1, Lxu2/d$b;

    const/16 v8, 0x21

    const/4 v9, 0x0

    const/4 v2, 0x0

    const/4 v3, 0x0

    const/4 v5, 0x0

    const/4 v7, 0x0

    invoke-direct/range {v1 .. v9}, Lxu2/d$b;-><init>(Lcom/whoop/design/atomic/organism/toolbar/d$a;Ljava/util/List;Lxu2/a;Lxu2/b;Lhu2/b;ZILkotlin/jvm/internal/DefaultConstructorMarker;)V

    sput-object v1, Lxu2/d$a;->b:Lxu2/d$b;

    return-void
.end method

.method private constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final a()Lxu2/d$b;
    .locals 1

    sget-object v0, Lxu2/d$a;->b:Lxu2/d$b;

    return-object v0
.end method
