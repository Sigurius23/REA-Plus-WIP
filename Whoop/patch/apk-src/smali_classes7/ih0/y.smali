.class public final synthetic Lih0/y;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# instance fields
.field public final synthetic E:J

.field public final synthetic w:Lt0/i;

.field public final synthetic x:Lp1/c1;

.field public final synthetic y:Li2/t;

.field public final synthetic z:Li2/t;


# direct methods
.method public synthetic constructor <init>(Lt0/i;Lp1/c1;Li2/t;Li2/t;J)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lih0/y;->w:Lt0/i;

    iput-object p2, p0, Lih0/y;->x:Lp1/c1;

    iput-object p3, p0, Lih0/y;->y:Li2/t;

    iput-object p4, p0, Lih0/y;->z:Li2/t;

    iput-wide p5, p0, Lih0/y;->E:J

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 7

    iget-wide v4, p0, Lih0/y;->E:J

    move-object v6, p1

    check-cast v6, Lk2/e;

    iget-object v0, p0, Lih0/y;->w:Lt0/i;

    iget-object v1, p0, Lih0/y;->x:Lp1/c1;

    iget-object v2, p0, Lih0/y;->y:Li2/t;

    iget-object v3, p0, Lih0/y;->z:Li2/t;

    invoke-static/range {v0 .. v6}, Lih0/e0;->R(Lt0/i;Lp1/c1;Li2/t;Li2/t;JLk2/e;)Ll83/a0;

    move-result-object p1

    return-object p1
.end method
