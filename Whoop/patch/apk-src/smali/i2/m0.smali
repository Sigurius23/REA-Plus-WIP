.class public final Li2/m0;
.super Li2/p0;
.source "SourceFile"


# instance fields
.field public final a:Li2/s0;


# direct methods
.method public constructor <init>(Li2/s0;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Li2/m0;->a:Li2/s0;

    return-void
.end method


# virtual methods
.method public final a()Lh2/c;
    .locals 1

    iget-object v0, p0, Li2/m0;->a:Li2/s0;

    check-cast v0, Li2/j;

    invoke-virtual {v0}, Li2/j;->g()Lh2/c;

    move-result-object v0

    return-object v0
.end method
