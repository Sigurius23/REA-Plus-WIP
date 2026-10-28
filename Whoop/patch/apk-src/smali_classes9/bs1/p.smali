.class public final synthetic Lbs1/p;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lc93/o;


# instance fields
.field public final synthetic E:Lp1/c1;

.field public final synthetic F:Lkotlin/jvm/functions/Function1;

.field public final synthetic w:Lkotlin/jvm/functions/Function1;

.field public final synthetic x:Lf0/r1;

.field public final synthetic y:Lc93/n;

.field public final synthetic z:Lds1/k;


# direct methods
.method public synthetic constructor <init>(Lkotlin/jvm/functions/Function1;Lf0/r1;Lc93/n;Lds1/k;Lp1/c1;Lkotlin/jvm/functions/Function1;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lbs1/p;->w:Lkotlin/jvm/functions/Function1;

    iput-object p2, p0, Lbs1/p;->x:Lf0/r1;

    iput-object p3, p0, Lbs1/p;->y:Lc93/n;

    iput-object p4, p0, Lbs1/p;->z:Lds1/k;

    iput-object p5, p0, Lbs1/p;->E:Lp1/c1;

    iput-object p6, p0, Lbs1/p;->F:Lkotlin/jvm/functions/Function1;

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 12

    check-cast p1, Ljava/lang/Long;

    invoke-virtual {p1}, Ljava/lang/Long;->longValue()J

    move-result-wide v6

    move-object v8, p2

    check-cast v8, Ljava/lang/String;

    move-object v9, p3

    check-cast v9, Lyr1/b;

    move-object/from16 p1, p4

    check-cast p1, Ljava/lang/Boolean;

    invoke-virtual {p1}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v10

    move-object/from16 p1, p5

    check-cast p1, Ljava/lang/Boolean;

    invoke-virtual {p1}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v11

    iget-object v0, p0, Lbs1/p;->w:Lkotlin/jvm/functions/Function1;

    iget-object v1, p0, Lbs1/p;->x:Lf0/r1;

    iget-object v2, p0, Lbs1/p;->y:Lc93/n;

    iget-object v3, p0, Lbs1/p;->z:Lds1/k;

    iget-object v4, p0, Lbs1/p;->E:Lp1/c1;

    iget-object v5, p0, Lbs1/p;->F:Lkotlin/jvm/functions/Function1;

    invoke-static/range {v0 .. v11}, Lbs1/c0;->j(Lkotlin/jvm/functions/Function1;Lf0/r1;Lc93/n;Lds1/k;Lp1/c1;Lkotlin/jvm/functions/Function1;JLjava/lang/String;Lyr1/b;ZZ)Ll83/a0;

    move-result-object p1

    return-object p1
.end method
