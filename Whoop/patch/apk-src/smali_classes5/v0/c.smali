.class public final synthetic Lv0/c;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# instance fields
.field public final synthetic E:J

.field public final synthetic w:Landroid/content/Context;

.field public final synthetic x:Landroid/content/pm/ResolveInfo;

.field public final synthetic y:Z

.field public final synthetic z:Ljava/lang/CharSequence;


# direct methods
.method public synthetic constructor <init>(Landroid/content/Context;Landroid/content/pm/ResolveInfo;ZLjava/lang/CharSequence;J)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lv0/c;->w:Landroid/content/Context;

    iput-object p2, p0, Lv0/c;->x:Landroid/content/pm/ResolveInfo;

    iput-boolean p3, p0, Lv0/c;->y:Z

    iput-object p4, p0, Lv0/c;->z:Ljava/lang/CharSequence;

    iput-wide p5, p0, Lv0/c;->E:J

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 7

    check-cast p1, Lx0/g;

    iget-boolean v0, p0, Lv0/c;->y:Z

    invoke-static {v0}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v4

    new-instance v6, Ll3/u0;

    iget-wide v0, p0, Lv0/c;->E:J

    invoke-direct {v6, v0, v1}, Ll3/u0;-><init>(J)V

    sget-object v1, Lv0/b;->b:Lv0/a;

    iget-object v2, p0, Lv0/c;->w:Landroid/content/Context;

    iget-object v3, p0, Lv0/c;->x:Landroid/content/pm/ResolveInfo;

    iget-object v5, p0, Lv0/c;->z:Ljava/lang/CharSequence;

    invoke-virtual/range {v1 .. v6}, Lv0/a;->invoke(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    invoke-interface {p1}, Lx0/g;->close()V

    sget-object p1, Ll83/a0;->a:Ll83/a0;

    return-object p1
.end method
