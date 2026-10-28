.class public abstract Lcom/whoop/community/g;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/whoop/community/g$b;,
        Lcom/whoop/community/g$a;
    }
.end annotation


# direct methods
.method public static a(ILjava/lang/String;)Lcom/whoop/community/g$a;
    .locals 2

    new-instance v0, Lcom/whoop/community/g$a;

    const/4 v1, 0x0

    invoke-direct {v0, p0, v1, p1}, Lcom/whoop/community/g$a;-><init>(IILjava/lang/String;)V

    return-object v0
.end method

.method public static b(ZLcom/whoop/domain/model/teams/Team;)Lcom/whoop/community/g$b;
    .locals 2

    new-instance v0, Lcom/whoop/community/g$b;

    const/4 v1, 0x0

    invoke-direct {v0, p0, p1, v1}, Lcom/whoop/community/g$b;-><init>(ZLcom/whoop/domain/model/teams/Team;I)V

    return-object v0
.end method
