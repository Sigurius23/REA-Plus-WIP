.class public final Lq30/c0;
.super Ls83/c;
.source "SourceFile"


# instance fields
.field public final synthetic E:Lev/i;

.field public F:I

.field public w:Lev/i;

.field public x:Lorg/json/JSONObject;

.field public y:Ljava/lang/String;

.field public synthetic z:Ljava/lang/Object;


# direct methods
.method public constructor <init>(Lev/i;Ls83/c;)V
    .locals 0

    iput-object p1, p0, Lq30/c0;->E:Lev/i;

    invoke-direct {p0, p2}, Ls83/c;-><init>(Lq83/d;)V

    return-void
.end method


# virtual methods
.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    iput-object p1, p0, Lq30/c0;->z:Ljava/lang/Object;

    iget p1, p0, Lq30/c0;->F:I

    const/high16 v0, -0x80000000

    or-int/2addr p1, v0

    iput p1, p0, Lq30/c0;->F:I

    iget-object p1, p0, Lq30/c0;->E:Lev/i;

    const/4 v0, 0x0

    invoke-virtual {p1, v0, p0}, Lev/i;->d(Lq30/q0;Ls83/c;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method
