.class public abstract Lep0/k;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0010\u000e\n\u0002\u0008\u0005\u001a\u0013\u0010\u0002\u001a\u00020\u0001*\u0004\u0018\u00010\u0000\u00a2\u0006\u0004\u0008\u0002\u0010\u0003\"\u0014\u0010\u0007\u001a\u00020\u00048\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u0005\u0010\u0006\"\u0015\u0010\u000b\u001a\u00020\u0008*\u00020\u00008F\u00a2\u0006\u0006\u001a\u0004\u0008\t\u0010\n\"\u0015\u0010\u000c\u001a\u00020\u0008*\u00020\u00008F\u00a2\u0006\u0006\u001a\u0004\u0008\u0005\u0010\n\u00a8\u0006\r"
    }
    d2 = {
        "Lep0/j;",
        "",
        "c",
        "(Lep0/j;)Z",
        "Ltr2/n;",
        "a",
        "Ltr2/n;",
        "screenContextMetadataLogger",
        "",
        "b",
        "(Lep0/j;)Ljava/lang/String;",
        "screenIdKey",
        "conversationKey",
        "coach-everywhere-common_release"
    }
    k = 0x2
    mv = {
        0x2,
        0x3,
        0x0
    }
    xi = 0x30
.end annotation


# static fields
.field private static final a:Ltr2/n;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    sget-object v0, Ltr2/n;->a:Ltr2/n$a;

    const-string v1, "ScreenContextMetadata"

    invoke-virtual {v0, v1}, Ltr2/n$a;->a(Ljava/lang/String;)Ltr2/n;

    move-result-object v0

    sput-object v0, Lep0/k;->a:Ltr2/n;

    return-void
.end method

.method public static final a(Lep0/j;)Ljava/lang/String;
    .locals 1

    const-string v0, "<this>"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p0}, Lep0/j;->k()Ljava/lang/String;

    move-result-object v0

    if-nez v0, :cond_0

    invoke-virtual {p0}, Lep0/j;->f()Ljava/lang/String;

    move-result-object v0

    if-nez v0, :cond_0

    invoke-static {p0}, Lep0/k;->b(Lep0/j;)Ljava/lang/String;

    move-result-object p0

    return-object p0

    :cond_0
    return-object v0
.end method

.method public static final b(Lep0/j;)Ljava/lang/String;
    .locals 3

    const-string v0, "<this>"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p0}, Lep0/j;->p()Ljava/lang/String;

    move-result-object p0

    if-nez p0, :cond_0

    sget-object p0, Lep0/k;->a:Ltr2/n;

    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v1, "ScreenContextMetadata.screenId was null"

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    const/4 v1, 0x0

    new-array v1, v1, [Lqr2/a$a;

    const-string v2, "ScreenContextMetadata.screenId was null; defaulting screen context key to empty string"

    invoke-interface {p0, v2, v0, v1}, Ltr2/n;->v(Ljava/lang/String;Ljava/lang/Throwable;[Lqr2/a$a;)V

    const-string p0, ""

    :cond_0
    return-object p0
.end method

.method public static final c(Lep0/j;)Z
    .locals 2

    if-eqz p0, :cond_0

    invoke-virtual {p0}, Lep0/j;->w()Z

    move-result v0

    const/4 v1, 0x1

    if-ne v0, v1, :cond_0

    invoke-virtual {p0}, Lep0/j;->d()Lcom/whoop/coacheverywherecommon/models/CoachEntry;

    move-result-object p0

    if-eqz p0, :cond_0

    invoke-virtual {p0}, Lcom/whoop/coacheverywherecommon/models/CoachEntry;->getType()Lcom/whoop/coacheverywherecommon/models/CoachSurfaceType;

    move-result-object p0

    if-eqz p0, :cond_0

    invoke-virtual {p0}, Lcom/whoop/coacheverywherecommon/models/CoachSurfaceType;->isBar()Z

    move-result p0

    if-ne p0, v1, :cond_0

    return v1

    :cond_0
    const/4 p0, 0x0

    return p0
.end method
