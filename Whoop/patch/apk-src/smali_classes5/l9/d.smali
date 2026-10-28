.class public final Ll9/d;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field public final a:Ll9/a;

.field public b:J

.field public c:Z

.field public d:Z


# direct methods
.method public constructor <init>(Ll9/a;)V
    .locals 2

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    iput-object p1, p0, Ll9/d;->a:Ll9/a;

    const/4 p1, 0x1

    iput-boolean p1, p0, Ll9/d;->c:Z

    const-wide/high16 v0, -0x8000000000000000L

    iput-wide v0, p0, Ll9/d;->b:J

    return-void
.end method
