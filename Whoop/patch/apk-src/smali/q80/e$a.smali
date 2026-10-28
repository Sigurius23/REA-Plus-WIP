.class public final Lq80/e$a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lq80/e;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lq80/e;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "a"
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0010\u000e\n\u0002\u0008\u0005\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0008\u0006\u0008\u00c7\u0002\u0018\u00002\u00020\u0001B\t\u0008\u0002\u00a2\u0006\u0004\u0008\u0002\u0010\u0003R\u001a\u0010\t\u001a\u00020\u00048\u0016X\u0096D\u00a2\u0006\u000c\n\u0004\u0008\u0005\u0010\u0006\u001a\u0004\u0008\u0007\u0010\u0008R \u0010\u0010\u001a\u0008\u0012\u0004\u0012\u00020\u000b0\n8\u0016X\u0096\u0004\u00a2\u0006\u000c\n\u0004\u0008\u000c\u0010\r\u001a\u0004\u0008\u000e\u0010\u000f\u00a8\u0006\u0011"
    }
    d2 = {
        "Lq80/e$a;",
        "Lq80/e;",
        "<init>",
        "()V",
        "",
        "b",
        "Ljava/lang/String;",
        "getFlow",
        "()Ljava/lang/String;",
        "flow",
        "",
        "Lq80/d;",
        "c",
        "Ljava/util/List;",
        "a",
        "()Ljava/util/List;",
        "flows",
        "activation_release"
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
.field public static final a:Lq80/e$a;

.field private static final b:Ljava/lang/String;

.field private static final c:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Lq80/d;",
            ">;"
        }
    .end annotation
.end field

.field public static final d:I


# direct methods
.method static constructor <clinit>()V
    .locals 3

    new-instance v0, Lq80/e$a;

    invoke-direct {v0}, Lq80/e$a;-><init>()V

    sput-object v0, Lq80/e$a;->a:Lq80/e$a;

    const-string v0, "accountTransition"

    sput-object v0, Lq80/e$a;->b:Ljava/lang/String;

    invoke-static {}, Lq80/a;->getEntries()Lt83/a;

    move-result-object v0

    new-instance v1, Ljava/util/ArrayList;

    const/16 v2, 0xa

    invoke-static {v0, v2}, Lm83/u;->i0(Ljava/lang/Iterable;I)I

    move-result v2

    invoke-direct {v1, v2}, Ljava/util/ArrayList;-><init>(I)V

    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_0

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lq80/a;

    invoke-virtual {v2}, Lq80/a;->getDescriptor()Lq80/d;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_0

    :cond_0
    sput-object v1, Lq80/e$a;->c:Ljava/util/List;

    const/16 v0, 0x8

    sput v0, Lq80/e$a;->d:I

    return-void
.end method

.method private constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public a()Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Lq80/d;",
            ">;"
        }
    .end annotation

    sget-object v0, Lq80/e$a;->c:Ljava/util/List;

    return-object v0
.end method
