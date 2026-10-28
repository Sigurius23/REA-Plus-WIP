.class public final Lf1/t1;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lf1/m;


# instance fields
.field public final synthetic w:Lf1/s1;

.field public final synthetic x:Z


# direct methods
.method public constructor <init>(Lf1/s1;Z)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lf1/t1;->w:Lf1/s1;

    iput-boolean p2, p0, Lf1/t1;->x:Z

    return-void
.end method


# virtual methods
.method public final a()J
    .locals 2

    iget-object v0, p0, Lf1/t1;->w:Lf1/s1;

    iget-boolean v1, p0, Lf1/t1;->x:Z

    invoke-virtual {v0, v1}, Lf1/s1;->k(Z)J

    move-result-wide v0

    return-wide v0
.end method
