.class public final synthetic Lbs1/z;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# instance fields
.field public final synthetic w:Lp1/c1;

.field public final synthetic x:Lp1/c1;

.field public final synthetic y:D

.field public final synthetic z:D


# direct methods
.method public synthetic constructor <init>(Lp1/c1;Lp1/c1;DD)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lbs1/z;->w:Lp1/c1;

    iput-object p2, p0, Lbs1/z;->x:Lp1/c1;

    iput-wide p3, p0, Lbs1/z;->y:D

    iput-wide p5, p0, Lbs1/z;->z:D

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 7

    iget-wide v4, p0, Lbs1/z;->z:D

    move-object v6, p1

    check-cast v6, Ljava/lang/String;

    iget-object v0, p0, Lbs1/z;->w:Lp1/c1;

    iget-object v1, p0, Lbs1/z;->x:Lp1/c1;

    iget-wide v2, p0, Lbs1/z;->y:D

    invoke-static/range {v0 .. v6}, Lbs1/c0;->M(Lp1/c1;Lp1/c1;DDLjava/lang/String;)Ll83/a0;

    move-result-object p1

    return-object p1
.end method
