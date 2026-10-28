.class public abstract Lcom/whoop/community/e;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/whoop/community/e$a;,
        Lcom/whoop/community/e$b;
    }
.end annotation


# direct methods
.method public static a(ILjava/lang/String;)Lcom/whoop/community/e$a;
    .locals 2

    new-instance v0, Lcom/whoop/community/e$a;

    const/4 v1, 0x0

    invoke-direct {v0, p0, v1, p1}, Lcom/whoop/community/e$a;-><init>(IILjava/lang/String;)V

    return-object v0
.end method

.method public static b()Lcom/whoop/community/e$b;
    .locals 2

    new-instance v0, Lcom/whoop/community/e$b;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lcom/whoop/community/e$b;-><init>(I)V

    return-object v0
.end method
