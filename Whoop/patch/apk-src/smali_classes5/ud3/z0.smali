.class public final Lud3/z0;
.super Lud3/a1;
.source "SourceFile"


# instance fields
.field public final synthetic E:Lne3/h;

.field public final synthetic y:Lud3/h0;

.field public final synthetic z:J


# direct methods
.method public constructor <init>(Lud3/h0;JLne3/h;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lud3/z0;->y:Lud3/h0;

    iput-wide p2, p0, Lud3/z0;->z:J

    iput-object p4, p0, Lud3/z0;->E:Lne3/h;

    return-void
.end method


# virtual methods
.method public final d1()Lne3/j;
    .locals 1

    iget-object v0, p0, Lud3/z0;->E:Lne3/h;

    return-object v0
.end method

.method public final i()J
    .locals 2

    iget-wide v0, p0, Lud3/z0;->z:J

    return-wide v0
.end method

.method public final k()Lud3/h0;
    .locals 1

    iget-object v0, p0, Lud3/z0;->y:Lud3/h0;

    return-object v0
.end method
