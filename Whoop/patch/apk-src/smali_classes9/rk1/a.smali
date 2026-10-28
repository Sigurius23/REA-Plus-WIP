.class public final Lrk1/a;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u001c\u0008\u00c7\u0002\u0018\u00002\u00020\u0001B\t\u0008\u0002\u00a2\u0006\u0004\u0008\u0002\u0010\u0003R\u0017\u0010\t\u001a\u00020\u00048\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0005\u0010\u0006\u001a\u0004\u0008\u0007\u0010\u0008R\u0017\u0010\u000c\u001a\u00020\u00048\u0006\u00a2\u0006\u000c\n\u0004\u0008\n\u0010\u0006\u001a\u0004\u0008\u000b\u0010\u0008R\u0017\u0010\u000e\u001a\u00020\u00048\u0006\u00a2\u0006\u000c\n\u0004\u0008\r\u0010\u0006\u001a\u0004\u0008\u0005\u0010\u0008R\u0017\u0010\u0011\u001a\u00020\u00048\u0006\u00a2\u0006\u000c\n\u0004\u0008\u000f\u0010\u0006\u001a\u0004\u0008\u0010\u0010\u0008R\u0017\u0010\u0013\u001a\u00020\u00048\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0012\u0010\u0006\u001a\u0004\u0008\u000f\u0010\u0008R\u0017\u0010\u0015\u001a\u00020\u00048\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0014\u0010\u0006\u001a\u0004\u0008\r\u0010\u0008R\u0017\u0010\u0016\u001a\u00020\u00048\u0006\u00a2\u0006\u000c\n\u0004\u0008\u000b\u0010\u0006\u001a\u0004\u0008\u0014\u0010\u0008R\u0017\u0010\u0017\u001a\u00020\u00048\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0007\u0010\u0006\u001a\u0004\u0008\u0012\u0010\u0008R\u0017\u0010\u0019\u001a\u00020\u00048\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0018\u0010\u0006\u001a\u0004\u0008\n\u0010\u0008R\u0017\u0010\u001c\u001a\u00020\u00048\u0006\u00a2\u0006\u000c\n\u0004\u0008\u001a\u0010\u0006\u001a\u0004\u0008\u001b\u0010\u0008R\u0017\u0010\u001d\u001a\u00020\u00048\u0006\u00a2\u0006\u000c\n\u0004\u0008\u001b\u0010\u0006\u001a\u0004\u0008\u001a\u0010\u0008R\u0017\u0010\u001f\u001a\u00020\u00048\u0006\u00a2\u0006\u000c\n\u0004\u0008\u001e\u0010\u0006\u001a\u0004\u0008\u0018\u0010\u0008\u00a8\u0006 "
    }
    d2 = {
        "Lrk1/a;",
        "",
        "<init>",
        "()V",
        "Lsk1/b;",
        "b",
        "Lsk1/b;",
        "i",
        "()Lsk1/b;",
        "shepherdNotDetected",
        "c",
        "h",
        "shepherdDetected",
        "d",
        "highHeartRateNotDetected",
        "e",
        "a",
        "highHeartRateDetected",
        "f",
        "lowHeartRateNotDetected",
        "g",
        "lowHeartRateDetected",
        "normalSinusRhythmNotDetected",
        "normalSinusRhythmDetected",
        "j",
        "inconclusiveDetermination",
        "k",
        "l",
        "unreadableDetermination",
        "unableToCheckTooLow",
        "m",
        "unableToCheckTooHigh",
        "heart-health-common_release"
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
.field public static final a:Lrk1/a;

.field private static final b:Lsk1/b;

.field private static final c:Lsk1/b;

.field private static final d:Lsk1/b;

.field private static final e:Lsk1/b;

.field private static final f:Lsk1/b;

.field private static final g:Lsk1/b;

.field private static final h:Lsk1/b;

.field private static final i:Lsk1/b;

.field private static final j:Lsk1/b;

.field private static final k:Lsk1/b;

.field private static final l:Lsk1/b;

.field private static final m:Lsk1/b;

.field public static final n:I


# direct methods
.method static constructor <clinit>()V
    .locals 4

    new-instance v0, Lrk1/a;

    invoke-direct {v0}, Lrk1/a;-><init>()V

    sput-object v0, Lrk1/a;->a:Lrk1/a;

    new-instance v0, Lsk1/b;

    sget v1, Lpk1/a;->w:I

    invoke-static {v1}, Lcom/whoop/design/util/b;->k(I)Lcom/whoop/design/util/TextResource$b;

    move-result-object v1

    sget-object v2, Lhy0/b2;->POSITIVE_RANGE:Lhy0/b2;

    invoke-direct {v0, v1, v2}, Lsk1/b;-><init>(Lcom/whoop/design/util/TextResource;Lhy0/b2;)V

    sput-object v0, Lrk1/a;->b:Lsk1/b;

    new-instance v0, Lsk1/b;

    sget v1, Lpk1/a;->v:I

    invoke-static {v1}, Lcom/whoop/design/util/b;->k(I)Lcom/whoop/design/util/TextResource$b;

    move-result-object v1

    sget-object v3, Lhy0/b2;->CONCERN_RANGE:Lhy0/b2;

    invoke-direct {v0, v1, v3}, Lsk1/b;-><init>(Lcom/whoop/design/util/TextResource;Lhy0/b2;)V

    sput-object v0, Lrk1/a;->c:Lsk1/b;

    new-instance v0, Lsk1/b;

    sget v1, Lpk1/a;->b:I

    invoke-static {v1}, Lcom/whoop/design/util/b;->k(I)Lcom/whoop/design/util/TextResource$b;

    move-result-object v1

    invoke-direct {v0, v1, v2}, Lsk1/b;-><init>(Lcom/whoop/design/util/TextResource;Lhy0/b2;)V

    sput-object v0, Lrk1/a;->d:Lsk1/b;

    new-instance v0, Lsk1/b;

    sget v1, Lpk1/a;->a:I

    invoke-static {v1}, Lcom/whoop/design/util/b;->k(I)Lcom/whoop/design/util/TextResource$b;

    move-result-object v1

    invoke-direct {v0, v1, v3}, Lsk1/b;-><init>(Lcom/whoop/design/util/TextResource;Lhy0/b2;)V

    sput-object v0, Lrk1/a;->e:Lsk1/b;

    new-instance v0, Lsk1/b;

    sget v1, Lpk1/a;->o:I

    invoke-static {v1}, Lcom/whoop/design/util/b;->k(I)Lcom/whoop/design/util/TextResource$b;

    move-result-object v1

    invoke-direct {v0, v1, v2}, Lsk1/b;-><init>(Lcom/whoop/design/util/TextResource;Lhy0/b2;)V

    sput-object v0, Lrk1/a;->f:Lsk1/b;

    new-instance v0, Lsk1/b;

    sget v1, Lpk1/a;->n:I

    invoke-static {v1}, Lcom/whoop/design/util/b;->k(I)Lcom/whoop/design/util/TextResource$b;

    move-result-object v1

    invoke-direct {v0, v1, v3}, Lsk1/b;-><init>(Lcom/whoop/design/util/TextResource;Lhy0/b2;)V

    sput-object v0, Lrk1/a;->g:Lsk1/b;

    new-instance v0, Lsk1/b;

    sget v1, Lpk1/a;->r:I

    invoke-static {v1}, Lcom/whoop/design/util/b;->k(I)Lcom/whoop/design/util/TextResource$b;

    move-result-object v1

    invoke-direct {v0, v1, v3}, Lsk1/b;-><init>(Lcom/whoop/design/util/TextResource;Lhy0/b2;)V

    sput-object v0, Lrk1/a;->h:Lsk1/b;

    new-instance v0, Lsk1/b;

    sget v1, Lpk1/a;->q:I

    invoke-static {v1}, Lcom/whoop/design/util/b;->k(I)Lcom/whoop/design/util/TextResource$b;

    move-result-object v1

    invoke-direct {v0, v1, v2}, Lsk1/b;-><init>(Lcom/whoop/design/util/TextResource;Lhy0/b2;)V

    sput-object v0, Lrk1/a;->i:Lsk1/b;

    new-instance v0, Lsk1/b;

    sget v1, Lpk1/a;->d:I

    invoke-static {v1}, Lcom/whoop/design/util/b;->k(I)Lcom/whoop/design/util/TextResource$b;

    move-result-object v1

    invoke-direct {v0, v1, v2}, Lsk1/b;-><init>(Lcom/whoop/design/util/TextResource;Lhy0/b2;)V

    sput-object v0, Lrk1/a;->j:Lsk1/b;

    new-instance v0, Lsk1/b;

    sget v1, Lpk1/a;->z:I

    invoke-static {v1}, Lcom/whoop/design/util/b;->k(I)Lcom/whoop/design/util/TextResource$b;

    move-result-object v1

    invoke-direct {v0, v1, v3}, Lsk1/b;-><init>(Lcom/whoop/design/util/TextResource;Lhy0/b2;)V

    sput-object v0, Lrk1/a;->k:Lsk1/b;

    new-instance v0, Lsk1/b;

    sget v1, Lpk1/a;->y:I

    invoke-static {v1}, Lcom/whoop/design/util/b;->k(I)Lcom/whoop/design/util/TextResource$b;

    move-result-object v1

    sget-object v2, Lhy0/b2;->NEUTRAL:Lhy0/b2;

    invoke-direct {v0, v1, v2}, Lsk1/b;-><init>(Lcom/whoop/design/util/TextResource;Lhy0/b2;)V

    sput-object v0, Lrk1/a;->l:Lsk1/b;

    new-instance v0, Lsk1/b;

    sget v1, Lpk1/a;->x:I

    invoke-static {v1}, Lcom/whoop/design/util/b;->k(I)Lcom/whoop/design/util/TextResource$b;

    move-result-object v1

    invoke-direct {v0, v1, v2}, Lsk1/b;-><init>(Lcom/whoop/design/util/TextResource;Lhy0/b2;)V

    sput-object v0, Lrk1/a;->m:Lsk1/b;

    sget v0, Lcom/whoop/design/util/TextResource;->$stable:I

    sput v0, Lrk1/a;->n:I

    return-void
.end method

.method private constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final a()Lsk1/b;
    .locals 1

    sget-object v0, Lrk1/a;->e:Lsk1/b;

    return-object v0
.end method

.method public final b()Lsk1/b;
    .locals 1

    sget-object v0, Lrk1/a;->d:Lsk1/b;

    return-object v0
.end method

.method public final c()Lsk1/b;
    .locals 1

    sget-object v0, Lrk1/a;->j:Lsk1/b;

    return-object v0
.end method

.method public final d()Lsk1/b;
    .locals 1

    sget-object v0, Lrk1/a;->g:Lsk1/b;

    return-object v0
.end method

.method public final e()Lsk1/b;
    .locals 1

    sget-object v0, Lrk1/a;->f:Lsk1/b;

    return-object v0
.end method

.method public final f()Lsk1/b;
    .locals 1

    sget-object v0, Lrk1/a;->i:Lsk1/b;

    return-object v0
.end method

.method public final g()Lsk1/b;
    .locals 1

    sget-object v0, Lrk1/a;->h:Lsk1/b;

    return-object v0
.end method

.method public final h()Lsk1/b;
    .locals 1

    sget-object v0, Lrk1/a;->c:Lsk1/b;

    return-object v0
.end method

.method public final i()Lsk1/b;
    .locals 1

    sget-object v0, Lrk1/a;->b:Lsk1/b;

    return-object v0
.end method

.method public final j()Lsk1/b;
    .locals 1

    sget-object v0, Lrk1/a;->m:Lsk1/b;

    return-object v0
.end method

.method public final k()Lsk1/b;
    .locals 1

    sget-object v0, Lrk1/a;->l:Lsk1/b;

    return-object v0
.end method

.method public final l()Lsk1/b;
    .locals 1

    sget-object v0, Lrk1/a;->k:Lsk1/b;

    return-object v0
.end method
