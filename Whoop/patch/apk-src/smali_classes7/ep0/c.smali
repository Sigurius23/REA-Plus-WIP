.class public abstract Lep0/c;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lep0/c$a;
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u000c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0003\u001a\u0015\u0010\u0002\u001a\u0004\u0018\u00010\u0001*\u0004\u0018\u00010\u0000\u00a2\u0006\u0004\u0008\u0002\u0010\u0003\u00a8\u0006\u0004"
    }
    d2 = {
        "Lcom/whoop/coacheverywherecommon/models/CoachEntry;",
        "Lep0/f;",
        "a",
        "(Lcom/whoop/coacheverywherecommon/models/CoachEntry;)Lep0/f;",
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


# direct methods
.method public static final a(Lcom/whoop/coacheverywherecommon/models/CoachEntry;)Lep0/f;
    .locals 3

    const/4 v0, 0x0

    if-eqz p0, :cond_0

    invoke-virtual {p0}, Lcom/whoop/coacheverywherecommon/models/CoachEntry;->getType()Lcom/whoop/coacheverywherecommon/models/CoachSurfaceType;

    move-result-object v1

    goto :goto_0

    :cond_0
    move-object v1, v0

    :goto_0
    if-nez v1, :cond_1

    const/4 v1, -0x1

    goto :goto_1

    :cond_1
    sget-object v2, Lep0/c$a;->a:[I

    invoke-virtual {v1}, Ljava/lang/Enum;->ordinal()I

    move-result v1

    aget v1, v2, v1

    :goto_1
    const/4 v2, 0x1

    if-eq v1, v2, :cond_3

    const/4 v2, 0x2

    if-eq v1, v2, :cond_3

    if-eqz p0, :cond_2

    invoke-virtual {p0}, Lcom/whoop/coacheverywherecommon/models/CoachEntry;->getData()Lcom/whoop/coacheverywherecommon/models/CoachEntryData;

    move-result-object p0

    if-eqz p0, :cond_2

    invoke-virtual {p0}, Lcom/whoop/coacheverywherecommon/models/CoachEntryData;->getOnLoadStyle()Lep0/f;

    move-result-object p0

    return-object p0

    :cond_2
    return-object v0

    :cond_3
    sget-object p0, Lep0/f;->PREVIEW:Lep0/f;

    return-object p0
.end method
