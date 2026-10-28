.class public final Lb11/i$d;
.super Lb11/i;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lb11/i;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "d"
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u000c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0003\u0008\u00c7\u0002\u0018\u00002\u00020\u0001B\t\u0008\u0002\u00a2\u0006\u0004\u0008\u0002\u0010\u0003\u00a8\u0006\u0004"
    }
    d2 = {
        "Lb11/i$d;",
        "Lb11/i;",
        "<init>",
        "()V",
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
.field public static final f:Lb11/i$d;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Lb11/i$d;

    invoke-direct {v0}, Lb11/i$d;-><init>()V

    sput-object v0, Lb11/i$d;->f:Lb11/i$d;

    return-void
.end method

.method private constructor <init>()V
    .locals 9

    sget-object v0, Lx81/d;->a:Lx81/d;

    invoke-virtual {v0}, Lx81/d;->d()Lgz0/o0;

    move-result-object v0

    invoke-virtual {v0}, Lgz0/o0;->o()Lgz0/i0;

    move-result-object v0

    invoke-virtual {v0}, Lgz0/i0;->m()I

    move-result v3

    new-instance v4, Lcom/whoop/design/util/TextResource$b;

    sget v0, Lgy0/f;->v:I

    const/4 v1, 0x0

    const/4 v2, 0x2

    invoke-direct {v4, v0, v1, v2, v1}, Lcom/whoop/design/util/TextResource$b;-><init>(ILjava/util/List;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    const/16 v7, 0x19

    const/4 v8, 0x0

    const/4 v2, 0x0

    const/4 v5, 0x0

    const/4 v6, 0x0

    move-object v1, p0

    invoke-direct/range {v1 .. v8}, Lb11/i;-><init>(IILcom/whoop/design/util/TextResource;ZLjava/lang/Integer;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    return-void
.end method
