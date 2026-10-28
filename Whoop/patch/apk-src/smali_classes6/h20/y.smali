.class public final Lh20/y;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field public final a:Lec3/h2;

.field public final b:Lec3/h2;


# direct methods
.method public constructor <init>()V
    .locals 1

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/4 v0, 0x0

    invoke-static {v0}, Lec3/v;->c(Ljava/lang/Object;)Lec3/h2;

    move-result-object v0

    iput-object v0, p0, Lh20/y;->a:Lec3/h2;

    iput-object v0, p0, Lh20/y;->b:Lec3/h2;

    return-void
.end method
