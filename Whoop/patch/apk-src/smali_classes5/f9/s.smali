.class public abstract Lf9/s;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field public final a:Lf9/j;

.field public final b:J

.field public final c:J


# direct methods
.method public constructor <init>(Lf9/j;JJ)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lf9/s;->a:Lf9/j;

    iput-wide p2, p0, Lf9/s;->b:J

    iput-wide p4, p0, Lf9/s;->c:J

    return-void
.end method


# virtual methods
.method public a(Lf9/m;)Lf9/j;
    .locals 0

    iget-object p1, p0, Lf9/s;->a:Lf9/j;

    return-object p1
.end method
