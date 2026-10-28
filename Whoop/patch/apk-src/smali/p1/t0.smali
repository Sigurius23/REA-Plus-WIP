.class public final Lp1/t0;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lp1/w2;


# instance fields
.field public final a:Ll83/p;


# direct methods
.method public constructor <init>(Lc93/a;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    invoke-static {p1}, Lq83/g;->H(Lc93/a;)Ll83/p;

    move-result-object p1

    iput-object p1, p0, Lp1/t0;->a:Ll83/p;

    return-void
.end method


# virtual methods
.method public final a(Lp1/p1;)Ljava/lang/Object;
    .locals 0

    iget-object p1, p0, Lp1/t0;->a:Ll83/p;

    invoke-virtual {p1}, Ll83/p;->getValue()Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method
