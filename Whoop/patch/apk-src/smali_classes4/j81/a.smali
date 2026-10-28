.class public final synthetic Lj81/a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# instance fields
.field public final synthetic E:Lj81/c;

.field public final synthetic F:J

.field public final synthetic G:Li91/h;

.field public final synthetic w:J

.field public final synthetic x:F

.field public final synthetic y:F

.field public final synthetic z:F


# direct methods
.method public synthetic constructor <init>(JFFFLj81/c;JLi91/h;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-wide p1, p0, Lj81/a;->w:J

    iput p3, p0, Lj81/a;->x:F

    iput p4, p0, Lj81/a;->y:F

    iput p5, p0, Lj81/a;->z:F

    iput-object p6, p0, Lj81/a;->E:Lj81/c;

    iput-wide p7, p0, Lj81/a;->F:J

    iput-object p9, p0, Lj81/a;->G:Li91/h;

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 10

    iget-object v8, p0, Lj81/a;->G:Li91/h;

    move-object v9, p1

    check-cast v9, Lk2/e;

    iget-wide v0, p0, Lj81/a;->w:J

    iget v2, p0, Lj81/a;->x:F

    iget v3, p0, Lj81/a;->y:F

    iget v4, p0, Lj81/a;->z:F

    iget-object v5, p0, Lj81/a;->E:Lj81/c;

    iget-wide v6, p0, Lj81/a;->F:J

    invoke-static/range {v0 .. v9}, Lj81/b;->a(JFFFLj81/c;JLi91/h;Lk2/e;)Ll83/a0;

    move-result-object p1

    return-object p1
.end method
