.class public final Lp6/v;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ln6/i;


# instance fields
.field public a:Ln6/o;


# direct methods
.method public constructor <init>()V
    .locals 1

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    sget-object v0, Ln6/m;->a:Ln6/m;

    iput-object v0, p0, Lp6/v;->a:Ln6/o;

    return-void
.end method


# virtual methods
.method public final a()Ln6/i;
    .locals 2

    new-instance v0, Lp6/v;

    invoke-direct {v0}, Lp6/v;-><init>()V

    iget-object v1, p0, Lp6/v;->a:Ln6/o;

    iput-object v1, v0, Lp6/v;->a:Ln6/o;

    return-object v0
.end method

.method public final b(Ln6/o;)V
    .locals 0

    iput-object p1, p0, Lp6/v;->a:Ln6/o;

    return-void
.end method

.method public final c()Ln6/o;
    .locals 1

    iget-object v0, p0, Lp6/v;->a:Ln6/o;

    return-object v0
.end method
