.class public final synthetic Lfc2/a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# instance fields
.field public final synthetic E:J

.field public final synthetic F:J

.field public final synthetic G:J

.field public final synthetic H:J

.field public final synthetic w:Lec2/c;

.field public final synthetic x:Lp1/c1;

.field public final synthetic y:J

.field public final synthetic z:J


# direct methods
.method public synthetic constructor <init>(Lec2/c;Lp1/c1;JJJJJJ)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lfc2/a;->w:Lec2/c;

    iput-object p2, p0, Lfc2/a;->x:Lp1/c1;

    iput-wide p3, p0, Lfc2/a;->y:J

    iput-wide p5, p0, Lfc2/a;->z:J

    iput-wide p7, p0, Lfc2/a;->E:J

    iput-wide p9, p0, Lfc2/a;->F:J

    iput-wide p11, p0, Lfc2/a;->G:J

    iput-wide p13, p0, Lfc2/a;->H:J

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 16

    move-object/from16 v0, p0

    iget-wide v13, v0, Lfc2/a;->H:J

    move-object/from16 v15, p1

    check-cast v15, Ln0/q;

    iget-object v1, v0, Lfc2/a;->w:Lec2/c;

    iget-object v2, v0, Lfc2/a;->x:Lp1/c1;

    iget-wide v3, v0, Lfc2/a;->y:J

    iget-wide v5, v0, Lfc2/a;->z:J

    iget-wide v7, v0, Lfc2/a;->E:J

    iget-wide v9, v0, Lfc2/a;->F:J

    iget-wide v11, v0, Lfc2/a;->G:J

    invoke-static/range {v1 .. v15}, Lfc2/b;->b(Lec2/c;Lp1/c1;JJJJJJLn0/q;)Ll83/a0;

    move-result-object v1

    return-object v1
.end method
