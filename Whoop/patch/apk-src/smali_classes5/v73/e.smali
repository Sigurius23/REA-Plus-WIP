.class public final Lv73/e;
.super Lv73/a;
.source "SourceFile"


# instance fields
.field public final y:Ll73/g;

.field public final z:I


# direct methods
.method public constructor <init>(Lv73/i;Ll73/g;I)V
    .locals 0

    invoke-direct {p0, p1}, Lv73/a;-><init>(Ll73/a;)V

    iput-object p2, p0, Lv73/e;->y:Ll73/g;

    iput p3, p0, Lv73/e;->z:I

    return-void
.end method


# virtual methods
.method public final c(Ll73/b;)V
    .locals 3

    iget-object v0, p0, Lv73/e;->y:Ll73/g;

    invoke-virtual {v0}, Ll73/g;->a()Ll73/f;

    move-result-object v0

    new-instance v1, Lv73/d;

    iget v2, p0, Lv73/e;->z:I

    invoke-direct {v1, p1, v0, v2}, Lv73/d;-><init>(Ll73/b;Ll73/f;I)V

    iget-object p1, p0, Lv73/a;->x:Ll73/a;

    invoke-virtual {p1, v1}, Ll73/a;->a(Ll73/b;)V

    return-void
.end method
