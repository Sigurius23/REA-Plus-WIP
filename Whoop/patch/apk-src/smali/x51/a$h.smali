.class public final Lx51/a$h;
.super Lx51/a;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lx51/a;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "h"
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u000c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0003\u0008\u00c7\u0002\u0018\u00002\u00020\u0001B\t\u0008\u0002\u00a2\u0006\u0004\u0008\u0002\u0010\u0003\u00a8\u0006\u0004"
    }
    d2 = {
        "Lx51/a$h;",
        "Lx51/a;",
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
.field public static final g:Lx51/a$h;

.field public static final h:I


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Lx51/a$h;

    invoke-direct {v0}, Lx51/a$h;-><init>()V

    sput-object v0, Lx51/a$h;->g:Lx51/a$h;

    const/16 v0, 0x8

    sput v0, Lx51/a$h;->h:I

    return-void
.end method

.method private constructor <init>()V
    .locals 9

    new-instance v2, Ly71/g;

    invoke-static {}, Lgz0/p0;->a()Lgz0/o0;

    move-result-object v0

    invoke-virtual {v0}, Lgz0/o0;->b()Lgz0/c;

    move-result-object v0

    invoke-virtual {v0}, Lgz0/c;->f()I

    move-result v0

    const-string v1, ""

    invoke-static {v1}, Lcom/whoop/design/util/b;->l(Ljava/lang/String;)Lcom/whoop/design/util/TextResource;

    move-result-object v1

    invoke-direct {v2, v0, v1}, Ly71/g;-><init>(ILcom/whoop/design/util/TextResource;)V

    new-instance v3, Lcom/whoop/design/util/TextResource$b;

    sget v0, Lgy0/f;->x0:I

    const/4 v1, 0x0

    const/4 v4, 0x2

    invoke-direct {v3, v0, v1, v4, v1}, Lcom/whoop/design/util/TextResource$b;-><init>(ILjava/util/List;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    sget-object v6, Lkd1/l;->STRENGTH_BUILDER:Lkd1/l;

    const/16 v7, 0x9

    const/4 v8, 0x0

    const/4 v4, 0x0

    const-string v5, "WorkoutLibraryTag"

    move-object v0, p0

    invoke-direct/range {v0 .. v8}, Lx51/a;-><init>(Ljava/lang/Object;Ly71/g;Lcom/whoop/design/util/TextResource;ZLjava/lang/String;Lkd1/l;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    return-void
.end method
