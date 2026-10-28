.class public abstract Li2/t;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field public static final b:Li2/s;


# instance fields
.field private final a:J


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Li2/s;

    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    sput-object v0, Li2/t;->b:Li2/s;

    return-void
.end method

.method public constructor <init>()V
    .locals 2

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const-wide v0, 0x7fc000007fc00000L    # 2.247117487993712E307

    iput-wide v0, p0, Li2/t;->a:J

    return-void
.end method


# virtual methods
.method public abstract a(JLi2/q0;F)V
.end method
