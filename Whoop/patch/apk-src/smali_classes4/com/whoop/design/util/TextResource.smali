.class public abstract Lcom/whoop/design/util/TextResource;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/whoop/design/util/TextResource$a;,
        Lcom/whoop/design/util/TextResource$b;,
        Lcom/whoop/design/util/TextResource$c;,
        Lcom/whoop/design/util/TextResource$d;,
        Lcom/whoop/design/util/TextResource$e;
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\r\n\u0002\u0008\u0008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u00087\u0018\u0000 \t2\u00020\u0001:\u0005\n\u000b\u000c\r\u000eB\t\u0008\u0004\u00a2\u0006\u0004\u0008\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H&\u00a2\u0006\u0004\u0008\u0007\u0010\u0008\u0082\u0001\u0003\u000f\u0010\u0011\u00a8\u0006\u0012"
    }
    d2 = {
        "Lcom/whoop/design/util/TextResource;",
        "",
        "<init>",
        "()V",
        "Landroid/content/Context;",
        "context",
        "",
        "resolve",
        "(Landroid/content/Context;)Ljava/lang/CharSequence;",
        "Companion",
        "d",
        "e",
        "b",
        "c",
        "a",
        "Lcom/whoop/design/util/TextResource$b;",
        "Lcom/whoop/design/util/TextResource$c;",
        "Lcom/whoop/design/util/TextResource$e;",
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

.annotation runtime Lwc3/i;
    with = Lmd1/a;
.end annotation


# static fields
.field public static final $stable:I

.field public static final Companion:Lcom/whoop/design/util/TextResource$a;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, Lcom/whoop/design/util/TextResource$a;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lcom/whoop/design/util/TextResource$a;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    sput-object v0, Lcom/whoop/design/util/TextResource;->Companion:Lcom/whoop/design/util/TextResource$a;

    return-void
.end method

.method private constructor <init>()V
    .locals 0

    .line 2
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public synthetic constructor <init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Lcom/whoop/design/util/TextResource;-><init>()V

    return-void
.end method


# virtual methods
.method public abstract resolve(Landroid/content/Context;)Ljava/lang/CharSequence;
.end method
