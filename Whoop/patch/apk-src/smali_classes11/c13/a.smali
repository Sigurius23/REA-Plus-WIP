.class public abstract synthetic Lc13/a;
.super Ljava/lang/Object;
.source "SourceFile"


# direct methods
.method public static A(Lp1/t1;Lkotlin/jvm/internal/k0;)Lp1/t1;
    .locals 1

    invoke-static {}, Lz81/d;->q()Lz81/b;

    move-result-object v0

    invoke-virtual {p0, v0}, Lp1/t1;->a(Ljava/lang/Object;)Lp1/u1;

    move-result-object p0

    invoke-virtual {p1, p0}, Lkotlin/jvm/internal/k0;->a(Ljava/lang/Object;)V

    invoke-static {}, Lx81/e;->u()Lp1/t1;

    move-result-object p0

    return-object p0
.end method

.method public static B(Lp1/t1;Lkotlin/jvm/internal/k0;)Lp1/t1;
    .locals 1

    invoke-static {}, Lz81/f;->c()Lz81/e;

    move-result-object v0

    invoke-virtual {p0, v0}, Lp1/t1;->a(Ljava/lang/Object;)Lp1/u1;

    move-result-object p0

    invoke-virtual {p1, p0}, Lkotlin/jvm/internal/k0;->a(Ljava/lang/Object;)V

    invoke-static {}, Lx81/e;->p()Lp1/t1;

    move-result-object p0

    return-object p0
.end method

.method public static C(Lp1/t1;Lkotlin/jvm/internal/k0;)Lp1/t1;
    .locals 1

    invoke-static {}, Lb91/e;->e()Lb91/d;

    move-result-object v0

    invoke-virtual {p0, v0}, Lp1/t1;->a(Ljava/lang/Object;)Lp1/u1;

    move-result-object p0

    invoke-virtual {p1, p0}, Lkotlin/jvm/internal/k0;->a(Ljava/lang/Object;)V

    invoke-static {}, Lx81/e;->r()Lp1/t1;

    move-result-object p0

    return-object p0
.end method

.method public static a()I
    .locals 1

    invoke-static {}, Lgz0/p0;->a()Lgz0/o0;

    move-result-object v0

    invoke-virtual {v0}, Lgz0/o0;->b()Lgz0/c;

    move-result-object v0

    invoke-virtual {v0}, Lgz0/c;->b()I

    move-result v0

    return v0
.end method

.method public static b(Lio/getstream/android/video/generated/models/CallResponse;II)I
    .locals 0

    invoke-virtual {p0}, Lio/getstream/android/video/generated/models/CallResponse;->hashCode()I

    move-result p0

    add-int/2addr p0, p1

    mul-int/2addr p0, p2

    return p0
.end method

.method public static c(Lio/getstream/chat/android/client/api2/model/dto/DownstreamUserDto;II)I
    .locals 0

    invoke-virtual {p0}, Lio/getstream/chat/android/client/api2/model/dto/DownstreamUserDto;->hashCode()I

    move-result p0

    add-int/2addr p0, p1

    mul-int/2addr p0, p2

    return p0
.end method

.method public static d(Lio/getstream/chat/android/client/api2/model/dto/utils/internal/ExactDate;II)I
    .locals 0

    invoke-virtual {p0}, Lio/getstream/chat/android/client/api2/model/dto/utils/internal/ExactDate;->hashCode()I

    move-result p0

    add-int/2addr p0, p1

    mul-int/2addr p0, p2

    return p0
.end method

.method public static e(Ljava/util/Map;II)I
    .locals 0

    invoke-virtual {p0}, Ljava/lang/Object;->hashCode()I

    move-result p0

    add-int/2addr p0, p1

    mul-int/2addr p0, p2

    return p0
.end method

.method public static f(Ljg3/i;II)I
    .locals 0

    invoke-virtual {p0}, Ljg3/i;->hashCode()I

    move-result p0

    add-int/2addr p0, p1

    mul-int/2addr p0, p2

    return p0
.end method

.method public static g(Lp1/u2;Lkotlin/jvm/internal/k0;Ljava/util/ArrayList;)I
    .locals 1

    invoke-static {}, Lx81/e;->v()Lq2/a;

    move-result-object v0

    invoke-virtual {p0, v0}, Lp1/u2;->a(Ljava/lang/Object;)Lp1/u1;

    move-result-object p0

    invoke-virtual {p1, p0}, Lkotlin/jvm/internal/k0;->a(Ljava/lang/Object;)V

    invoke-static {}, Lx81/c;->d()[Lp1/u1;

    move-result-object p0

    invoke-virtual {p1, p0}, Lkotlin/jvm/internal/k0;->e(Ljava/lang/Object;)V

    invoke-virtual {p2}, Ljava/util/ArrayList;->size()I

    move-result p0

    return p0
.end method

.method public static h(Ljava/io/IOException;Ljava/lang/StringBuilder;)Ljava/lang/String;
    .locals 0

    invoke-virtual {p0}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    move-result-object p0

    invoke-virtual {p1, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p0

    return-object p0
.end method

.method public static i(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Z)Ljava/lang/String;
    .locals 1

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0, p0}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v0, p4}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, p3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p0

    return-object p0
.end method

.method public static j(Ljava/lang/String;Ljava/lang/String;Ljava/lang/StringBuilder;)Ljava/lang/String;
    .locals 0

    invoke-static {p0}, Lcom/mapbox/bindgen/RecordUtils;->fieldToString(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object p0

    invoke-virtual {p2, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p2, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p0

    return-object p0
.end method

.method public static k(Ljava/lang/String;Ljava/lang/String;Z)Ljava/lang/String;
    .locals 1

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0, p0}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v0, p2}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p0

    return-object p0
.end method

.method public static l(Ljava/lang/StringBuilder;Ljava/lang/String;Ljava/lang/StringBuilder;Ljava/lang/String;)Ljava/lang/String;
    .locals 0

    invoke-virtual {p0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p0

    invoke-virtual {p2, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p2, p3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p0

    return-object p0
.end method

.method public static m(Ljava/lang/StringBuilder;Ljava/util/List;Ljava/lang/String;)Ljava/lang/String;
    .locals 0

    invoke-virtual {p0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {p0, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p0

    return-object p0
.end method

.method public static n(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/Date;Ljava/lang/String;)Ljava/lang/StringBuilder;
    .locals 1

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0, p0}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, p3}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, p4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    return-object v0
.end method

.method public static o(FLp1/q;)Lp1/k1;
    .locals 0

    invoke-static {p0}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    move-result-object p0

    invoke-static {p0}, Lp1/x;->z(Ljava/lang/Object;)Lp1/k1;

    move-result-object p0

    invoke-virtual {p1, p0}, Lp1/q;->p0(Ljava/lang/Object;)V

    return-object p0
.end method

.method public static p(Lm83/a0;Lp1/t1;Lkotlin/jvm/internal/k0;)Lp1/t1;
    .locals 1

    new-instance v0, Lx81/a;

    invoke-direct {v0, p0}, Lx81/a;-><init>(Ljava/util/Set;)V

    invoke-virtual {p1, v0}, Lp1/t1;->a(Ljava/lang/Object;)Lp1/u1;

    move-result-object p0

    invoke-virtual {p2, p0}, Lkotlin/jvm/internal/k0;->a(Ljava/lang/Object;)V

    invoke-static {}, Lqf1/a;->c()Lp1/t1;

    move-result-object p0

    return-object p0
.end method

.method public static q(Lp1/t1;Lfy1/i;Lkotlin/jvm/internal/k0;)Lp1/t1;
    .locals 0

    invoke-virtual {p0, p1}, Lp1/t1;->a(Ljava/lang/Object;)Lp1/u1;

    move-result-object p0

    invoke-virtual {p2, p0}, Lkotlin/jvm/internal/k0;->a(Ljava/lang/Object;)V

    invoke-static {}, Ldp0/h;->c()Lp1/t1;

    move-result-object p0

    return-object p0
.end method

.method public static r(Lp1/t1;Lkotlin/jvm/internal/k0;)Lp1/t1;
    .locals 1

    invoke-static {}, Ly81/j;->c()Ly81/i;

    move-result-object v0

    invoke-virtual {p0, v0}, Lp1/t1;->a(Ljava/lang/Object;)Lp1/u1;

    move-result-object p0

    invoke-virtual {p1, p0}, Lkotlin/jvm/internal/k0;->a(Ljava/lang/Object;)V

    invoke-static {}, Lx81/e;->t()Lp1/t1;

    move-result-object p0

    return-object p0
.end method

.method public static s(DLjava/lang/String;Ljava/lang/StringBuilder;)V
    .locals 0

    invoke-static {p0, p1}, Ljava/lang/Double;->valueOf(D)Ljava/lang/Double;

    move-result-object p0

    invoke-static {p0}, Lcom/mapbox/bindgen/RecordUtils;->fieldToString(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object p0

    invoke-virtual {p3, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p3, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    return-void
.end method

.method public static t(JLjava/lang/String;Ljava/lang/StringBuilder;)V
    .locals 0

    invoke-static {p0, p1}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object p0

    invoke-static {p0}, Lcom/mapbox/bindgen/RecordUtils;->fieldToString(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object p0

    invoke-virtual {p3, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p3, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    return-void
.end method

.method public static u(Landroid/os/Parcel;ILjava/lang/Integer;)V
    .locals 0

    invoke-virtual {p0, p1}, Landroid/os/Parcel;->writeInt(I)V

    invoke-virtual {p2}, Ljava/lang/Integer;->intValue()I

    move-result p1

    invoke-virtual {p0, p1}, Landroid/os/Parcel;->writeInt(I)V

    return-void
.end method

.method public static v(Ljava/lang/String;Ljava/lang/String;Ljava/lang/StringBuilder;)V
    .locals 0

    invoke-static {p0}, Lcom/mapbox/bindgen/RecordUtils;->fieldToString(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object p0

    invoke-virtual {p2, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p2, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    return-void
.end method

.method public static w(Ljava/lang/StringBuilder;Ljava/lang/Boolean;Ljava/lang/String;Ljava/lang/Boolean;Ljava/lang/String;)V
    .locals 0

    invoke-virtual {p0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {p0, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p0, p3}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {p0, p4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    return-void
.end method

.method public static x(Ljava/lang/StringBuilder;Ljava/util/Map;Ljava/lang/String;Ljava/util/Map;Ljava/lang/String;)V
    .locals 0

    invoke-virtual {p0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {p0, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p0, p3}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {p0, p4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    return-void
.end method

.method public static synthetic y(Lm91/u;)V
    .locals 0

    if-nez p0, :cond_0

    return-void

    :cond_0
    new-instance p0, Ljava/lang/ClassCastException;

    invoke-direct {p0}, Ljava/lang/ClassCastException;-><init>()V

    throw p0
.end method

.method public static z(Lm83/a0;Lp1/t1;Lkotlin/jvm/internal/k0;)Lp1/t1;
    .locals 1

    new-instance v0, Lx81/a;

    invoke-direct {v0, p0}, Lx81/a;-><init>(Ljava/util/Set;)V

    invoke-virtual {p1, v0}, Lp1/t1;->a(Ljava/lang/Object;)Lp1/u1;

    move-result-object p0

    invoke-virtual {p2, p0}, Lkotlin/jvm/internal/k0;->a(Ljava/lang/Object;)V

    invoke-static {}, Lfy1/m;->c()Lp1/t1;

    move-result-object p0

    return-object p0
.end method
