.class public final Li9/n;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field public static final e:Li9/n;


# instance fields
.field public final a:J

.field public final b:J

.field public final c:J

.field public final d:Llo/w;


# direct methods
.method static constructor <clinit>()V
    .locals 7

    new-instance v0, Li9/n;

    const-wide v3, -0x7fffffffffffffffL    # -4.9E-324

    const-wide v5, -0x7fffffffffffffffL    # -4.9E-324

    const-wide v1, -0x7fffffffffffffffL    # -4.9E-324

    invoke-direct/range {v0 .. v6}, Li9/n;-><init>(JJJ)V

    sput-object v0, Li9/n;->e:Li9/n;

    return-void
.end method

.method public constructor <init>(JJJ)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-wide p1, p0, Li9/n;->a:J

    iput-wide p3, p0, Li9/n;->b:J

    iput-wide p5, p0, Li9/n;->c:J

    new-instance p1, Llo/w;

    const/4 p2, 0x1

    invoke-direct {p1, p2}, Llo/w;-><init>(I)V

    iput-object p1, p0, Li9/n;->d:Llo/w;

    return-void
.end method
