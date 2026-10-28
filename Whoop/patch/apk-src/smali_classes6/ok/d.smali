.class public final Lok/d;
.super Lal/a;
.source "SourceFile"


# instance fields
.field public final y:Ljava/lang/String;


# direct methods
.method public constructor <init>(Lorg/json/JSONObject;)V
    .locals 2

    sget-object v0, Lok/c;->E:Lok/c;

    const/4 v1, 0x4

    invoke-direct {p0, v0, v1}, Lal/a;-><init>(Ljava/lang/Object;I)V

    invoke-static {p1}, Lhg3/i;->U(Lorg/json/JSONObject;)Ljava/lang/String;

    move-result-object p1

    iput-object p1, p0, Lok/d;->y:Ljava/lang/String;

    return-void
.end method


# virtual methods
.method public final H0()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lok/d;->y:Ljava/lang/String;

    return-object v0
.end method
