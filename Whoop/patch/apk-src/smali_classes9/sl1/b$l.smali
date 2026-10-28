.class public final Lsl1/b$l;
.super Lsl1/b;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lsl1/b;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "l"
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u000c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0003\u0008\u00c7\u0002\u0018\u00002\u00020\u0001B\t\u0008\u0002\u00a2\u0006\u0004\u0008\u0002\u0010\u0003\u00a8\u0006\u0004"
    }
    d2 = {
        "Lsl1/b$l;",
        "Lsl1/b;",
        "<init>",
        "()V",
        "connectivity-common-ui_release"
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
.field public static final o:Lsl1/b$l;

.field public static final p:I


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Lsl1/b$l;

    invoke-direct {v0}, Lsl1/b$l;-><init>()V

    sput-object v0, Lsl1/b$l;->o:Lsl1/b$l;

    sget v0, Lcom/whoop/design/util/TextResource;->$stable:I

    sput v0, Lsl1/b$l;->p:I

    return-void
.end method

.method private constructor <init>()V
    .locals 17

    sget v0, Los0/h;->P:I

    invoke-static {v0}, Lcom/whoop/design/util/b;->k(I)Lcom/whoop/design/util/TextResource$b;

    move-result-object v2

    sget v0, Los0/h;->O:I

    invoke-static {v0}, Lcom/whoop/design/util/b;->k(I)Lcom/whoop/design/util/TextResource$b;

    move-result-object v3

    sget-object v0, Lx81/d;->a:Lx81/d;

    invoke-virtual {v0}, Lx81/d;->d()Lgz0/o0;

    move-result-object v0

    invoke-virtual {v0}, Lgz0/o0;->o()Lgz0/i0;

    move-result-object v0

    invoke-virtual {v0}, Lgz0/i0;->i()I

    move-result v0

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v5

    sget-object v11, La11/d;->SUCCESS:La11/d;

    sget-object v13, La11/c;->CROSS:La11/c;

    const/16 v15, 0x15f4

    const/16 v16, 0x0

    const/4 v4, 0x0

    const/4 v6, 0x0

    const/4 v7, 0x0

    const/4 v8, 0x0

    const/4 v9, 0x0

    const/4 v10, 0x0

    const/4 v12, 0x0

    const/4 v14, 0x0

    move-object/from16 v1, p0

    invoke-direct/range {v1 .. v16}, Lsl1/b;-><init>(Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Ljava/lang/Integer;ZLcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;ZLa11/d;La11/b;La11/c;ZILkotlin/jvm/internal/DefaultConstructorMarker;)V

    return-void
.end method
