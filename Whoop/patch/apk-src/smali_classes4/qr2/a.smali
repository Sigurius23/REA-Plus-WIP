.class public abstract Lqr2/a;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lqr2/a$a;
    }
.end annotation


# instance fields
.field public final tags:Ljava/util/Set;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Set<",
            "Lqr2/a$a;",
            ">;"
        }
    .end annotation
.end field

.field public final timestamp:J


# direct methods
.method public varargs constructor <init>(J[Lqr2/a$a;)V
    .locals 1

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const-class v0, Lqr2/a$a;

    invoke-static {v0}, Ljava/util/EnumSet;->noneOf(Ljava/lang/Class;)Ljava/util/EnumSet;

    move-result-object v0

    iput-object v0, p0, Lqr2/a;->tags:Ljava/util/Set;

    iput-wide p1, p0, Lqr2/a;->timestamp:J

    invoke-static {v0, p3}, Ljava/util/Collections;->addAll(Ljava/util/Collection;[Ljava/lang/Object;)Z

    return-void
.end method
