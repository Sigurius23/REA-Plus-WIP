.class public abstract Ltx/c;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field public final a:Ll83/p;


# direct methods
.method public constructor <init>()V
    .locals 2

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    new-instance v0, Lm5/k;

    const/16 v1, 0xa

    invoke-direct {v0, p0, v1}, Lm5/k;-><init>(Ljava/lang/Object;I)V

    invoke-static {v0}, Lq83/g;->H(Lc93/a;)Ll83/p;

    move-result-object v0

    iput-object v0, p0, Ltx/c;->a:Ll83/p;

    return-void
.end method


# virtual methods
.method public abstract a(Ljava/lang/Object;)Ljava/lang/Object;
.end method

.method public abstract b(Ljava/lang/Object;Ljava/lang/Object;)V
.end method
