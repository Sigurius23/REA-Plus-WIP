.class public final Lnl2/a;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0010\u0008\u00c7\u0002\u0018\u00002\u00020\u0001B\t\u0008\u0002\u00a2\u0006\u0004\u0008\u0002\u0010\u0003R\u0017\u0010\t\u001a\u00020\u00048\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0005\u0010\u0006\u001a\u0004\u0008\u0007\u0010\u0008R\u0017\u0010\u000c\u001a\u00020\u00048\u0006\u00a2\u0006\u000c\n\u0004\u0008\n\u0010\u0006\u001a\u0004\u0008\u000b\u0010\u0008R\u0017\u0010\u000e\u001a\u00020\u00048\u0006\u00a2\u0006\u000c\n\u0004\u0008\u000b\u0010\u0006\u001a\u0004\u0008\r\u0010\u0008R\u0017\u0010\u0010\u001a\u00020\u00048\u0006\u00a2\u0006\u000c\n\u0004\u0008\r\u0010\u0006\u001a\u0004\u0008\u000f\u0010\u0008R\u0017\u0010\u0011\u001a\u00020\u00048\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0007\u0010\u0006\u001a\u0004\u0008\n\u0010\u0008R\u0017\u0010\u0013\u001a\u00020\u00048\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0012\u0010\u0006\u001a\u0004\u0008\u0005\u0010\u0008\u00a8\u0006\u0014"
    }
    d2 = {
        "Lnl2/a;",
        "",
        "<init>",
        "()V",
        "Lnl2/c$c;",
        "b",
        "Lnl2/c$c;",
        "f",
        "()Lnl2/c$c;",
        "restingInfo",
        "c",
        "d",
        "maxHrInfo",
        "e",
        "resetHrZones",
        "a",
        "changeHrZones",
        "leaveScreen",
        "g",
        "discardChanges",
        "training_release"
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
.field public static final a:Lnl2/a;

.field private static final b:Lnl2/c$c;

.field private static final c:Lnl2/c$c;

.field private static final d:Lnl2/c$c;

.field private static final e:Lnl2/c$c;

.field private static final f:Lnl2/c$c;

.field private static final g:Lnl2/c$c;

.field public static final h:I


# direct methods
.method static constructor <clinit>()V
    .locals 19

    new-instance v0, Lnl2/a;

    invoke-direct {v0}, Lnl2/a;-><init>()V

    sput-object v0, Lnl2/a;->a:Lnl2/a;

    new-instance v1, Lnl2/c$c;

    sget v0, Lal2/d;->f0:I

    invoke-static {v0}, Lcom/whoop/design/util/b;->k(I)Lcom/whoop/design/util/TextResource$b;

    move-result-object v2

    sget v0, Lal2/d;->e0:I

    invoke-static {v0}, Lcom/whoop/design/util/b;->k(I)Lcom/whoop/design/util/TextResource$b;

    move-result-object v6

    const/16 v10, 0xae

    const/4 v11, 0x0

    const/4 v3, 0x0

    const/4 v4, 0x0

    const/4 v5, 0x0

    const/4 v7, 0x0

    const/4 v8, 0x1

    const/4 v9, 0x0

    invoke-direct/range {v1 .. v11}, Lnl2/c$c;-><init>(Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Ly81/e;Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Lml2/a;ZLml2/a;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    sput-object v1, Lnl2/a;->b:Lnl2/c$c;

    new-instance v2, Lnl2/c$c;

    sget v0, Lal2/d;->d0:I

    invoke-static {v0}, Lcom/whoop/design/util/b;->k(I)Lcom/whoop/design/util/TextResource$b;

    move-result-object v3

    sget v0, Lal2/d;->c0:I

    invoke-static {v0}, Lcom/whoop/design/util/b;->k(I)Lcom/whoop/design/util/TextResource$b;

    move-result-object v7

    const/16 v11, 0xae

    const/4 v12, 0x0

    const/4 v6, 0x0

    const/4 v8, 0x0

    const/4 v9, 0x1

    const/4 v10, 0x0

    invoke-direct/range {v2 .. v12}, Lnl2/c$c;-><init>(Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Ly81/e;Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Lml2/a;ZLml2/a;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    sput-object v2, Lnl2/a;->c:Lnl2/c$c;

    sget v0, Lal2/d;->k0:I

    invoke-static {v0}, Lcom/whoop/design/util/b;->k(I)Lcom/whoop/design/util/TextResource$b;

    move-result-object v2

    sget v0, Lal2/d;->i0:I

    invoke-static {v0}, Lcom/whoop/design/util/b;->k(I)Lcom/whoop/design/util/TextResource$b;

    move-result-object v6

    sget v0, Lal2/d;->j0:I

    invoke-static {v0}, Lcom/whoop/design/util/b;->k(I)Lcom/whoop/design/util/TextResource$b;

    move-result-object v3

    sget v0, Lal2/d;->Q:I

    invoke-static {v0}, Lcom/whoop/design/util/b;->k(I)Lcom/whoop/design/util/TextResource$b;

    move-result-object v5

    sget-object v7, Lml2/a$b$j;->a:Lml2/a$b$j;

    new-instance v1, Lnl2/c$c;

    const/16 v10, 0xc4

    const/4 v11, 0x0

    const/4 v8, 0x0

    const/4 v9, 0x0

    invoke-direct/range {v1 .. v11}, Lnl2/c$c;-><init>(Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Ly81/e;Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Lml2/a;ZLml2/a;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    sput-object v1, Lnl2/a;->d:Lnl2/c$c;

    sget v0, Lal2/d;->i:I

    invoke-static {v0}, Lcom/whoop/design/util/b;->k(I)Lcom/whoop/design/util/TextResource$b;

    move-result-object v2

    sget v0, Lal2/d;->h:I

    invoke-static {v0}, Lcom/whoop/design/util/b;->k(I)Lcom/whoop/design/util/TextResource$b;

    move-result-object v6

    sget v0, Lal2/d;->R:I

    invoke-static {v0}, Lcom/whoop/design/util/b;->k(I)Lcom/whoop/design/util/TextResource$b;

    move-result-object v3

    sget-object v4, Ly81/f;->RECOVERY:Ly81/f;

    sget v0, Lal2/d;->Q:I

    invoke-static {v0}, Lcom/whoop/design/util/b;->k(I)Lcom/whoop/design/util/TextResource$b;

    move-result-object v5

    sget-object v7, Lml2/a$b$c;->a:Lml2/a$b$c;

    new-instance v1, Lnl2/c$c;

    const/16 v10, 0xc0

    invoke-direct/range {v1 .. v11}, Lnl2/c$c;-><init>(Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Ly81/e;Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Lml2/a;ZLml2/a;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    sput-object v1, Lnl2/a;->e:Lnl2/c$c;

    sget v0, Lal2/d;->q:I

    invoke-static {v0}, Lcom/whoop/design/util/b;->k(I)Lcom/whoop/design/util/TextResource$b;

    move-result-object v2

    sget v0, Lal2/d;->n:I

    invoke-static {v0}, Lcom/whoop/design/util/b;->k(I)Lcom/whoop/design/util/TextResource$b;

    move-result-object v6

    sget v0, Lal2/d;->p:I

    invoke-static {v0}, Lcom/whoop/design/util/b;->k(I)Lcom/whoop/design/util/TextResource$b;

    move-result-object v3

    sget v0, Lal2/d;->o:I

    invoke-static {v0}, Lcom/whoop/design/util/b;->k(I)Lcom/whoop/design/util/TextResource$b;

    move-result-object v5

    sget-object v7, Lml2/a$a$a;->a:Lml2/a$a$a;

    sget-object v16, Lml2/a$b$b;->a:Lml2/a$b$b;

    new-instance v1, Lnl2/c$c;

    const/16 v10, 0x44

    const/4 v4, 0x0

    move-object/from16 v9, v16

    invoke-direct/range {v1 .. v11}, Lnl2/c$c;-><init>(Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Ly81/e;Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Lml2/a;ZLml2/a;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    sput-object v1, Lnl2/a;->f:Lnl2/c$c;

    sget v0, Lal2/d;->q:I

    invoke-static {v0}, Lcom/whoop/design/util/b;->k(I)Lcom/whoop/design/util/TextResource$b;

    move-result-object v9

    sget v0, Lal2/d;->m:I

    invoke-static {v0}, Lcom/whoop/design/util/b;->k(I)Lcom/whoop/design/util/TextResource$b;

    move-result-object v13

    sget v0, Lal2/d;->p:I

    invoke-static {v0}, Lcom/whoop/design/util/b;->k(I)Lcom/whoop/design/util/TextResource$b;

    move-result-object v10

    sget v0, Lal2/d;->o:I

    invoke-static {v0}, Lcom/whoop/design/util/b;->k(I)Lcom/whoop/design/util/TextResource$b;

    move-result-object v12

    new-instance v8, Lnl2/c$c;

    const/16 v17, 0x64

    const/16 v18, 0x0

    const/4 v14, 0x0

    const/4 v15, 0x0

    invoke-direct/range {v8 .. v18}, Lnl2/c$c;-><init>(Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Ly81/e;Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Lml2/a;ZLml2/a;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    sput-object v8, Lnl2/a;->g:Lnl2/c$c;

    const/16 v0, 0x8

    sput v0, Lnl2/a;->h:I

    return-void
.end method

.method private constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final a()Lnl2/c$c;
    .locals 1

    sget-object v0, Lnl2/a;->e:Lnl2/c$c;

    return-object v0
.end method

.method public final b()Lnl2/c$c;
    .locals 1

    sget-object v0, Lnl2/a;->g:Lnl2/c$c;

    return-object v0
.end method

.method public final c()Lnl2/c$c;
    .locals 1

    sget-object v0, Lnl2/a;->f:Lnl2/c$c;

    return-object v0
.end method

.method public final d()Lnl2/c$c;
    .locals 1

    sget-object v0, Lnl2/a;->c:Lnl2/c$c;

    return-object v0
.end method

.method public final e()Lnl2/c$c;
    .locals 1

    sget-object v0, Lnl2/a;->d:Lnl2/c$c;

    return-object v0
.end method

.method public final f()Lnl2/c$c;
    .locals 1

    sget-object v0, Lnl2/a;->b:Lnl2/c$c;

    return-object v0
.end method
