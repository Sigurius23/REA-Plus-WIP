.class public final Lc0/r;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ly2/g1;


# instance fields
.field public final w:Lp1/k1;


# direct methods
.method public constructor <init>(Z)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    invoke-static {p1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object p1

    invoke-static {p1}, Lp1/x;->z(Ljava/lang/Object;)Lp1/k1;

    move-result-object p1

    iput-object p1, p0, Lc0/r;->w:Lp1/k1;

    return-void
.end method


# virtual methods
.method public final g()Ljava/lang/Object;
    .locals 0

    return-object p0
.end method
