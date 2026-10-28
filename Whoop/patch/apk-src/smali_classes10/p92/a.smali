.class public Lp92/a;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field private final a:I

.field private final b:Lp92/e;

.field private final c:J


# direct methods
.method public constructor <init>(Lp92/e;JI)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput p4, p0, Lp92/a;->a:I

    iput-object p1, p0, Lp92/a;->b:Lp92/e;

    iput-wide p2, p0, Lp92/a;->c:J

    return-void
.end method


# virtual methods
.method public a()J
    .locals 2

    iget-wide v0, p0, Lp92/a;->c:J

    return-wide v0
.end method

.method public b()I
    .locals 1

    iget v0, p0, Lp92/a;->a:I

    return v0
.end method

.method public c()Lp92/e;
    .locals 1

    iget-object v0, p0, Lp92/a;->b:Lp92/e;

    return-object v0
.end method
