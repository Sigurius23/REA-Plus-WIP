.class public abstract Lmc3/d;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field public static final a:Lhc3/x;


# direct methods
.method static constructor <clinit>()V
    .locals 3

    new-instance v0, Lhc3/x;

    const-string v1, "NO_OWNER"

    const/4 v2, 0x0

    invoke-direct {v0, v1, v2}, Lhc3/x;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lmc3/d;->a:Lhc3/x;

    return-void
.end method

.method public static a()Lmc3/c;
    .locals 2

    new-instance v0, Lmc3/c;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lmc3/c;-><init>(Z)V

    return-object v0
.end method

.method public static synthetic b(Lmc3/a;)V
    .locals 1

    const/4 v0, 0x0

    invoke-interface {p0, v0}, Lmc3/a;->i(Ljava/lang/Object;)V

    return-void
.end method
